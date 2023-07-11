SUMMARY = "Mutable mapping tools"
DESCRIPTION = "Mutable Mapping interfaces for python."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-zict-2.2.0-1.5.noarch.rpm"
RPM_HASH = "c3d3de2dc7bd74e9037066b94d9b4e7aef21965c667c030e8b3843bde00745e3a76d26bdb4543cb05934e04cf5cfd7c474d433d3403e353c86287b3863952cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zict \
python3.11dist-zict \
python311-zict \
python3dist-zict"

RDEPENDS:${PN} += "python-abi \
python311-HeapDict"

inherit rpm

SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-flit-3.8.0-5.3.noarch.rpm"
RPM_HASH = "c1527cb4e6bfdf7783c9a3a00ad8615a994995b008d4f2865d41764849c70679d54cd149a47d86794cb7524e84ca08c254f95f5a837ef282150df763e557b587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flit \
python310-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
python310-flit-core \
python310-requests \
python310-tomli-w \
update-alternatives"

inherit rpm

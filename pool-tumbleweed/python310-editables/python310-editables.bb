SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-editables-0.4-1.1.noarch.rpm"
RPM_HASH = "bce65b2070ad510d0a0268ea7acb1fe4985e56f35b7a8a643484406399815e08d0faaf243148da3a95ef45cb14561e35e45452c91ea9c2cbc0587d683e875de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-editables \
python310-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-editables-0.4-1.1.noarch.rpm"
RPM_HASH = "f16d2c282bc5fb8196897a92ba8915071ff096e9612fa88cb8c259cb5144824506428d719278428e6d4e620c81c0d4f5b6530817017cda5809dd672cae758681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-editables \
python3.11dist-editables \
python311-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm

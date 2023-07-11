SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-devcenter-1.0.0.0-1.2.noarch.rpm"
RPM_HASH = "a656908b194aaad7c0b896479c1bfc066639a84f92c0ac2bdfa8b4b8d1f40830e1c18104d9ac5924faad863289976d397ebb29b513755fdf3d5e014cffd5a341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devcenter \
python3.11dist-azure-mgmt-devcenter \
python311-azure-mgmt-devcenter \
python3dist-azure-mgmt-devcenter"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm

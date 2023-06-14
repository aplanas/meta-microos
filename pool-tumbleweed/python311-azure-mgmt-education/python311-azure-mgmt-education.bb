SUMMARY = "Microsoft Azure Education Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Education Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-mgmt-education-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "b428fb42c4725bb65b322e58baefa99f79d6de9cf3fd79ef61f82a9770332e36ff4cab02c21e2140bcce6e6a78da75237ed66bf4c3eebd55c2ba707825befe3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-education \
python311-azure-mgmt-education \
python3dist-azure-mgmt-education"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

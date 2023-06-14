SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python310-azure-mgmt-azurestackhci-7.0.0-1.5.noarch.rpm"
RPM_HASH = "c9387f10e74328ddbfe274f5f2352c502957ffa954046dd012086e8f8d1b25ea9722d06ded4d9d431a4f901a5a86f71441301c37a039ccaa65fd34aeb7ca564b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurestackhci \
python3.10dist-azure-mgmt-azurestackhci \
python310-azure-mgmt-azurestackhci \
python3dist-azure-mgmt-azurestackhci"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python310-azure-mgmt-azurestackhci-7.0.0-1.6.noarch.rpm"
RPM_HASH = "fb845dcd0437e62d538e4f2d0b6b98a69c40f2e945ad5364a6e6a98bac2da32fa514b704061f4b98f11de5727babaf6ea4a232600aac6c2c962bb95c31149b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-azurestackhci \
python310-azure-mgmt-azurestackhci \
python3dist-azure-mgmt-azurestackhci"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

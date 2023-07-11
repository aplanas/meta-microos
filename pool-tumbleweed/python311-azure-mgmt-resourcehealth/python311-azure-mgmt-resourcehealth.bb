SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-mgmt-resourcehealth-1.0.0b4-1.2.noarch.rpm"
RPM_HASH = "c12ab4edbf8f407be453d133e8ab563ea50ae8c2ac10faf68468b6d8148613cbb2f695dd6cb105ed7d386640214663a7b18a2413ee61133f44601234a54a2e04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcehealth \
python3.11dist-azure-mgmt-resourcehealth \
python311-azure-mgmt-resourcehealth \
python3dist-azure-mgmt-resourcehealth"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm

SUMMARY = "Microsoft Azure Guestconfig Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Guestconfig Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-guestconfig-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "31d4a8e7b9d66f5ee059b163da5468cdba9cae8a30a3a97f20df278338552cf22b7671ab3bca111d67d50010175d345005b0ea283233a5f40c66549867b7d1bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-guestconfig \
python3.11dist-azure-mgmt-guestconfig \
python311-azure-mgmt-guestconfig \
python3dist-azure-mgmt-guestconfig"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

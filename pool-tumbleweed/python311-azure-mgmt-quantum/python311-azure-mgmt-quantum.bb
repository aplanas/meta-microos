SUMMARY = "Microsoft Azure Quantum Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quantum Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python311-azure-mgmt-quantum-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "bc5400f329dd624511217c0f2c8a56b4f8e404b352e9bb008205e14aa648c47385e2b61f1c09992ab6add17085e42d2ed4be7fd8bc4e64e661b833c0795deda9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-quantum \
python311-azure-mgmt-quantum \
python3dist-azure-mgmt-quantum"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-mgmt-resourceconnector-1.0.0b4-1.1.noarch.rpm"
RPM_HASH = "a64517e3f7f636e0ccafa2cf54c1760655b2e41b5dc94e0d8af7de8fd026cd09616a21f85ed4bbc6651b369a61b39d349c1111b9115c8a0323ec4515e14d9ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourceconnector \
python3.10dist(azure-mgmt-resourceconnector) \
python310-azure-mgmt-resourceconnector \
python3dist(azure-mgmt-resourceconnector)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm

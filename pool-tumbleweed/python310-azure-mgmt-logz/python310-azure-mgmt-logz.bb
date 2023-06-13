SUMMARY = "Microsoft Azure Logz Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Logz Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-logz-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "483f99f8cf879dbbd2829f2f91befdd486f04a6e016130e2a9d2ba79457ae9b5a86dfce2a1cc2fb1b8a4214088f62fcd7c5d0b2edd7670141e445e98c7b999d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-logz \
python3.10dist(azure-mgmt-logz) \
python310-azure-mgmt-logz \
python3dist(azure-mgmt-logz)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python310-azure-mgmt-avs-7.1.0-1.4.noarch.rpm"
RPM_HASH = "aaf0299e8f4056924bcb18272ece58c56fa9c800ee925fc46f2bc4933df60f985cfc628b341d5c3e1a358022e45df1a018f2fc32e830cf44cdb5c0b93d143ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-avs \
python310-azure-mgmt-avs \
python3dist-azure-mgmt-avs"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

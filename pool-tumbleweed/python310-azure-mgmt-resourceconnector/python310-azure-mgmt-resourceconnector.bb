SUMMARY = "Microsoft Azure Resourceconnector Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resourceconnector Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-mgmt-resourceconnector-1.0.0b4-1.2.noarch.rpm"
RPM_HASH = "35c2a1ff6a0ab51662082961a617ec664b54fc4047fc22fd41d3f8fa4f3e8b68a019060390716bf90c80d5e8e24b21d283878ca2e3f444fd917db359a36429ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-resourceconnector \
python310-azure-mgmt-resourceconnector \
python3dist-azure-mgmt-resourceconnector"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm

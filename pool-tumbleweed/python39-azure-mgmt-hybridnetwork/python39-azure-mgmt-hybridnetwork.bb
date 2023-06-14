SUMMARY = "Microsoft Azure Hybridnetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridnetwork Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-hybridnetwork-1.0.0-1.8.noarch.rpm"
RPM_HASH = "840d0ab09561c64363e8f3a28a95ab36c14408be8ba5c925031ab674ad4ba0f321a976b347ff5465a81a71bd46cf40ebf5e431a7773920d294053077aaf0b299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-hybridnetwork \
python39-azure-mgmt-hybridnetwork \
python3dist-azure-mgmt-hybridnetwork"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

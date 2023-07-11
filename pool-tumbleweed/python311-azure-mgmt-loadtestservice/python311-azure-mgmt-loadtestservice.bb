SUMMARY = "Microsoft Azure Loadtestservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtestservice Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-loadtestservice-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "9b8cf0f63fc1e6e6ebeeb0e952bd3e6dc086402ebef66d929509c857e8fb8c829f807642bbe1061fc0939b749a0ee52d81178af54f6d43cc3f7fb251f19bbaa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-loadtestservice \
python3.11dist-azure-mgmt-loadtestservice \
python311-azure-mgmt-loadtestservice \
python3dist-azure-mgmt-loadtestservice"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

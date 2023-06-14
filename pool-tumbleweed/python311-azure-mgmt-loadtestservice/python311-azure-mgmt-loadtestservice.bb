SUMMARY = "Microsoft Azure Loadtestservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtestservice Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-loadtestservice-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "07e49877c84e83c0ebacc31fcb66e6c9809a8f397fe11bef01fae570d312ae8645c3d7025696b4fb047fe115117dc40b7137ab2de5f14bb65821ca7e83109038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-loadtestservice \
python311-azure-mgmt-loadtestservice \
python3dist-azure-mgmt-loadtestservice"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

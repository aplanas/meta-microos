SUMMARY = "Microsoft Azure Storagepool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagepool Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-storagepool-1.0.0-1.9.noarch.rpm"
RPM_HASH = "a2dcf66556c44d7982516d2469ed6edf0bb93528fea3a193d9936af11a62e4708bf6e0d98f89edc1c88754bab362602e0c767253c9db1f85c422234ac83de6a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-storagepool \
python39-azure-mgmt-storagepool \
python3dist-azure-mgmt-storagepool"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

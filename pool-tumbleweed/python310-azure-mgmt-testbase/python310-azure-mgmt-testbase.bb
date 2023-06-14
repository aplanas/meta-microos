SUMMARY = "Microsoft Azure Testbase Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Testbase Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-testbase-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "f1b6852d066479e9e102f7835760074bbbf21968879e9b9c6b5ac9e36175b2cbe6d563c514993520fd02a6a8b5f4fa9ab32aac3d364d794877c33c6f5e4c855e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-testbase \
python3.10dist-azure-mgmt-testbase \
python310-azure-mgmt-testbase \
python3dist-azure-mgmt-testbase"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

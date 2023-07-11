SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-mgmt-authorization-3.0.0-1.4.noarch.rpm"
RPM_HASH = "4a03c80e93e857bd8ce0940b530d115dbf8383deeecf0aa6d0f1366572b5c01830fd6caed5d373c84f08c486ae4323d7f17e62a99ffe7c835f1a01cd1a3386fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-authorization \
python310-azure-mgmt-authorization \
python3dist-azure-mgmt-authorization"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm

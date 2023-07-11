SUMMARY = "Microsoft Azure CDN Management Client Library"
DESCRIPTION = "This is the Microsoft Azure CDN Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python310-azure-mgmt-cdn-12.0.0-1.7.noarch.rpm"
RPM_HASH = "fcdd3494d9f966f819cee4e6207f70f61b5f8980ddefa307ebf0a2b6ccf496b90b221a9bbb47cf9950f38f0b22644ed418215e51ce9938fd5574b41e134eefc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-cdn \
python310-azure-mgmt-cdn \
python3dist-azure-mgmt-cdn"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

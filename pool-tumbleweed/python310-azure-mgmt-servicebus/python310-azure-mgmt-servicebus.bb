SUMMARY = "Microsoft Azure Service Bus Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python310-azure-mgmt-servicebus-8.2.0-1.3.noarch.rpm"
RPM_HASH = "0a59e5264a7701ceffb701d230ef9940a0c3ec412e92d86626252e5cf5041b29217a9fd28a277f53aa01440b5699c573d5d0c350e4cbc96b5f3d420a07140a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicebus \
python3.10dist-azure-mgmt-servicebus \
python310-azure-mgmt-servicebus \
python3dist-azure-mgmt-servicebus"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

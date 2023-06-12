SUMMARY = "Microsoft Azure Service Bus Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python39-azure-mgmt-servicebus-8.2.0-1.3.noarch.rpm"
RPM_HASH = "1c482a5bdce4a63a806dab861117f61e5f1903f4305ce9fa05edc8964028c11e202ff75975f03748f7e1740b47e1bc2b4ce7758cd2af298e305cbe8ed4d555e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-servicebus) \
python39-azure-mgmt-servicebus \
python3dist(azure-mgmt-servicebus)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

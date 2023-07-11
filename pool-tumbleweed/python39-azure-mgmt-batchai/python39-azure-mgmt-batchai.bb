SUMMARY = "Microsoft Azure Batch AI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch AI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0b1"

RPM_NAME = "python39-azure-mgmt-batchai-7.0.0b1-1.9.noarch.rpm"
RPM_HASH = "881eddd4010ffa64fa53170f88297900263406a952360042dcdbd45218377e2adc2bf873e2f0bcd0234b2ab47ddc71cfc1f55a8c6607a53c3aaedff72700c0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-batchai \
python39-azure-mgmt-batchai \
python3dist-azure-mgmt-batchai"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

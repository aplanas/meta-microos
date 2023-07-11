SUMMARY = "Microsoft Azure Batch AI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch AI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0b1"

RPM_NAME = "python311-azure-mgmt-batchai-7.0.0b1-1.9.noarch.rpm"
RPM_HASH = "d419e766339b4d420a90a5cb9925e155a13abdd79281f73f5fc7e3e582bc489a66be6c8547042629c14a070e1fb1a855a43d7ebacc65a665b2cff33a266a3178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-batchai \
python3.11dist-azure-mgmt-batchai \
python311-azure-mgmt-batchai \
python3dist-azure-mgmt-batchai"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

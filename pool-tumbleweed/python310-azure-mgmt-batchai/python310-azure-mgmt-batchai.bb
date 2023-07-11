SUMMARY = "Microsoft Azure Batch AI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch AI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0b1"

RPM_NAME = "python310-azure-mgmt-batchai-7.0.0b1-1.9.noarch.rpm"
RPM_HASH = "1aae5ddb1e6fde3bb584f5154aa91bfc04e6fd79c0383bfdcc1f6d5dec50c765d037e75ba972ef7fd29ba1afa89477e82d31b4db0009a4296b160b3d384855e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-batchai \
python310-azure-mgmt-batchai \
python3dist-azure-mgmt-batchai"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

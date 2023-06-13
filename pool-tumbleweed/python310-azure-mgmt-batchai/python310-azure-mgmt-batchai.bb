SUMMARY = "Microsoft Azure Batch AI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch AI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0b1"

RPM_NAME = "python310-azure-mgmt-batchai-7.0.0b1-1.8.noarch.rpm"
RPM_HASH = "7679868d9d94d6cc097acbf65c14a2aa0cba26717c9ac0f64a1df5737b072552c2297fde960be3f48a026f89cfc1b10a4a4a5bc0757cbf21a829144f2191ba60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-batchai \
python3.10dist(azure-mgmt-batchai) \
python310-azure-mgmt-batchai \
python3dist(azure-mgmt-batchai)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

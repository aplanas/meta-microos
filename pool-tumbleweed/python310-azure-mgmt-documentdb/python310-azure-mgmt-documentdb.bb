SUMMARY = "Microsoft Azure DocumentDB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DocumentDB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python310-azure-mgmt-documentdb-0.1.3-6.12.noarch.rpm"
RPM_HASH = "8285844b723f33e15ce3e93ffdfda8f67d97a8a33ad0c057525f57d43cc78382494b9065d249dfc9cc092036066b1db38dd1595f19e219fa6617339f7926c4f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-documentdb \
python310-azure-mgmt-documentdb \
python3dist-azure-mgmt-documentdb"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm

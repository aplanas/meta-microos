SUMMARY = "Microsoft Azure Resource Graph Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Graph Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python310-azure-mgmt-resourcegraph-8.0.0-1.9.noarch.rpm"
RPM_HASH = "9b227970007d7437e41fab6b7c81129ea1cdcd0e8b0fd446db4a5afe9171d3f57384a7b6af7dcacefa2062ba2beb40f62b854b6ad4da7b6bbf038eb936989776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-resourcegraph \
python310-azure-mgmt-resourcegraph \
python3dist-azure-mgmt-resourcegraph"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

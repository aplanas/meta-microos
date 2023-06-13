SUMMARY = "Microsoft Azure Resource Graph Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Graph Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python311-azure-mgmt-resourcegraph-8.0.0-1.8.noarch.rpm"
RPM_HASH = "8f36da4189e6fcc6e9275f32701d47cdc84ee14f5305d77b6b2eb29591fea314c11ef305b0a70842e0675c816e82cbec0a3834704c9a6753434683ccd852815d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-resourcegraph) \
python311-azure-mgmt-resourcegraph \
python3dist(azure-mgmt-resourcegraph)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

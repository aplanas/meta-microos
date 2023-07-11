SUMMARY = "Microsoft Azure Storagemover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagemover Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-storagemover-1.0.0-1.3.noarch.rpm"
RPM_HASH = "a35037ba02969ed3efbe8ed482106eff1d159cdbff4f2fafd05245800ffac4ec3f8dbabbb1a48f5bf66d306f11f4283da9483d36f5a3cfc1b6fec562ba275610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagemover \
python3.11dist-azure-mgmt-storagemover \
python311-azure-mgmt-storagemover \
python3dist-azure-mgmt-storagemover"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

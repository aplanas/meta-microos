SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-healthcareapis-1.1.0-1.6.noarch.rpm"
RPM_HASH = "6bbd1c9976d8859d11e9eac7ca90d9d78e3df7c3252dbc73a4df84713804dc49003127d3e5c7af4c1bdfc5807f83e402587262e9625e66a076e91b861a3f20d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-healthcareapis \
python3.10dist(azure-mgmt-healthcareapis) \
python310-azure-mgmt-healthcareapis \
python3dist(azure-mgmt-healthcareapis)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

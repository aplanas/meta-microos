SUMMARY = "Microsoft Azure Advisor Client Library"
DESCRIPTION = "This is the Microsoft Azure Advisor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python310-azure-mgmt-advisor-9.0.0-1.11.noarch.rpm"
RPM_HASH = "2545cf53f27d301ca826852cf01838fd099c2c8770fcacb6b16cb1b6703e2ab86d52edfcce199ff61d3e0be383f0ecbac582469efd59b2440b139369e4d2e880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-advisor \
python310-azure-mgmt-advisor \
python3dist-azure-mgmt-advisor"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

SUMMARY = "Microsoft Azure Alerts Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Alerts Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-alertsmanagement-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "88a652f453b384d2f4e021be2a82e669dc20594ce05384da1752fb05e5f58d44d946857d253e6221835242661ae4cb0455369c41dcceff752dad2dc6a433c1d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-alertsmanagement \
python310-azure-mgmt-alertsmanagement \
python3dist-azure-mgmt-alertsmanagement"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b10"

RPM_NAME = "python310-azure-mgmt-sql-4.0.0b10-1.2.noarch.rpm"
RPM_HASH = "dd0eb5e78cd4bd96f9da69eb9cd5babf1c0274efb04689768c5d3a290ed746c0d54a529281dba700fedcb5799454ba7da2cd47f943a8f74b51b3fa86fb792835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-sql \
python310-azure-mgmt-sql \
python3dist-azure-mgmt-sql"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm

SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b11"

RPM_NAME = "python310-azure-mgmt-sql-4.0.0b11-1.1.noarch.rpm"
RPM_HASH = "3696a8f25afe92dad0fb72c2a290675bdc42908aa06db8cea0667bd2086dde4b24e77f921d6b0a5c205cc08ecee0761eb5a9ea0ae3f1a20d64fcf65cc60c2cad"
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

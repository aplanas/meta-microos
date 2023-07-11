SUMMARY = "Microsoft Azure Data Lake Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-azure-mgmt-datalake-analytics-0.6.0-4.12.noarch.rpm"
RPM_HASH = "ff948ee57801af8636c71f5912e53ad5c7ba269671237bfe4077095f3ad6ae37aa62edca88b155c6364b15fd96d355beadf1382050737ad5230cd2034798eb83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-datalake-analytics \
python310-azure-mgmt-datalake-analytics \
python3dist-azure-mgmt-datalake-analytics"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-datalake-nspkg \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm

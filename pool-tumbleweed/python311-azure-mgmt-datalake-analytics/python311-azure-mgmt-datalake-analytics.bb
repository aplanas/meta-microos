SUMMARY = "Microsoft Azure Data Lake Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-azure-mgmt-datalake-analytics-0.6.0-4.11.noarch.rpm"
RPM_HASH = "ab4e5e9ee89b3431fc9b7ac38e12e4dadad87986824c7b2348939ab14835d9e498ffc7318fa8aa67c3d2613403d6a48e262c901e04a61687669854b53e880d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-datalake-analytics \
python311-azure-mgmt-datalake-analytics \
python3dist-azure-mgmt-datalake-analytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-datalake-nspkg \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm

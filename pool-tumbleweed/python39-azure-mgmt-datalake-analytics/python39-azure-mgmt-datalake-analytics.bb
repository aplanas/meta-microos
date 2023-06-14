SUMMARY = "Microsoft Azure Data Lake Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-azure-mgmt-datalake-analytics-0.6.0-4.11.noarch.rpm"
RPM_HASH = "3db5e3859704b95e1315beb2cef06b608458341a40dfc2151bab60ff4d3fde3c85de2fa84dd65f3ad9f4063619f4d8d382de6c5d5195ce38f272f4af89229310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-datalake-analytics \
python39-azure-mgmt-datalake-analytics \
python3dist-azure-mgmt-datalake-analytics"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-datalake-nspkg \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm

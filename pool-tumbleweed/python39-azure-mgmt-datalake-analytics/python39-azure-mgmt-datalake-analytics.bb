SUMMARY = "Microsoft Azure Data Lake Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-azure-mgmt-datalake-analytics-0.6.0-4.12.noarch.rpm"
RPM_HASH = "0eb3aa1b417c9802cb06cfc80f2c33800baba08e4d5eade1c480530780af5846a4d8b9378e027e75e5b6d0d00a6efe9e78acb2c9567f6ce241b99e1c77dd98df"
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

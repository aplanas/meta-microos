SUMMARY = "Microsoft Azure Data Lake Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-azure-mgmt-datalake-analytics-0.6.0-4.12.noarch.rpm"
RPM_HASH = "56cf4c9b749b4c75e0c0d9235cf8577a8d6d5805d5bd7db6f0affc6792b52343d53c6ee152ba8a662b6dcfe7e12f646246cd5b128d215345b2d2bcec36ae7ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datalake-analytics \
python3.11dist-azure-mgmt-datalake-analytics \
python311-azure-mgmt-datalake-analytics \
python3dist-azure-mgmt-datalake-analytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-datalake-nspkg \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm

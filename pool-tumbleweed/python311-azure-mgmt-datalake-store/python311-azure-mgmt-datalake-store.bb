SUMMARY = "Microsoft Azure Data Lake Store Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-datalake-store-1.0.0-1.10.noarch.rpm"
RPM_HASH = "3743ef0158b78cf957991d2ee12887883c1ad929561a96092e60b6e91162df857a3218ed831f782043d8d17d47701e647167dc16740c879b019fa2ec2f78e1d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-datalake-store \
python311-azure-mgmt-datalake-store \
python3dist-azure-mgmt-datalake-store"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-datalake-nspkg \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

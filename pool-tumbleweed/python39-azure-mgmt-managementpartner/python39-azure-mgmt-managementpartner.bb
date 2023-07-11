SUMMARY = "Microsoft Azure ManagementPartner Management Client Library"
DESCRIPTION = "This is the Microsoft Azure ManagementPartner Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-managementpartner-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "4b29fcce7efe228de3ced143495f9e9117780e22e5c98640f85417e492d2199bc5c7a6027cfa2ca140797ea88c8b5e4a361a3a173116eccf476d039c98251a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-managementpartner \
python39-azure-mgmt-managementpartner \
python3dist-azure-mgmt-managementpartner"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

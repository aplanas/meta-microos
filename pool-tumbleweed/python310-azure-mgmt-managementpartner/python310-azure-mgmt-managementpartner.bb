SUMMARY = "Microsoft Azure ManagementPartner Management Client Library"
DESCRIPTION = "This is the Microsoft Azure ManagementPartner Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-managementpartner-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "24f3e0455e7a529c170e2561729c157426a3b7d9c48059d5302d6f7404c39f8a6a604ad26c2793e883ce67e8bfa841a7222133f9e8a082be329bdb354c1c775a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managementpartner \
python3.10dist-azure-mgmt-managementpartner \
python310-azure-mgmt-managementpartner \
python3dist-azure-mgmt-managementpartner"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

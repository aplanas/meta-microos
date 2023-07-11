SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python311-azure-mgmt-network-23.1.0-1.2.noarch.rpm"
RPM_HASH = "d4be48f60854dabc409ff98778041fbd420ef4a74b44dc4ebdd4bd86c72659e0247acd5b2018e14e8f93d98336211fd73e091aa5a449f721f0a9ffbb7f685c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-network \
python3.11dist-azure-mgmt-network \
python311-azure-mgmt-network \
python3dist-azure-mgmt-network"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm

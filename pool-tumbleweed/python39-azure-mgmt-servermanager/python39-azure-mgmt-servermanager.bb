SUMMARY = "Microsoft Azure Server Manager Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Server Manager Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-servermanager-2.0.0-4.11.noarch.rpm"
RPM_HASH = "0997542c92064223672b6e982f57d3a379212593a0a0bca138a8006d5aa349fd1bad9628a6621dc0c637cb6c93782676df186e692a8274354c94dabb79e3cf68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-servermanager \
python39-azure-mgmt-servermanager \
python3dist-azure-mgmt-servermanager"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm

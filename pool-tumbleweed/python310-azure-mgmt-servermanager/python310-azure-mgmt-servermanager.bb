SUMMARY = "Microsoft Azure Server Manager Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Server Manager Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-servermanager-2.0.0-4.12.noarch.rpm"
RPM_HASH = "26eb267fa83c522f4decca16619bf29cee7eae060745715eb22bfbca0d23f3dea87e61b07c20ed9735b934d9d15740bea7886ff770ae078cfc219a0f36f16172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-servermanager \
python310-azure-mgmt-servermanager \
python3dist-azure-mgmt-servermanager"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm

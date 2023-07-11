SUMMARY = "Microsoft Azure Server Manager Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Server Manager Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-servermanager-2.0.0-4.12.noarch.rpm"
RPM_HASH = "1fcc7c8851bf90d0b49e836c8fad462f543512e81e4fdee0ccbc8e385cda6da14a735312cff57f40e4c9f7ad5b3a667e36b0ab5649f4520f37644429aa40f7b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servermanager \
python3.11dist-azure-mgmt-servermanager \
python311-azure-mgmt-servermanager \
python3dist-azure-mgmt-servermanager"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm

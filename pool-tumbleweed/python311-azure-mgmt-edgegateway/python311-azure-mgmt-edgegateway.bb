SUMMARY = "Microsoft Azure Data Box Edge / Data Box Gateway Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Box Edge / Data Box Gateway Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-azure-mgmt-edgegateway-0.1.0-2.19.noarch.rpm"
RPM_HASH = "267bd170f7edc5af17ec48c7356cccd25cbabd61b37122afcbe2fa3a0641f1ef6a2df20c0a9884e999f4c438db83128352b61381789367b119ced8005ab8f3b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-edgegateway \
python3.11dist-azure-mgmt-edgegateway \
python311-azure-mgmt-edgegateway \
python3dist-azure-mgmt-edgegateway"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm

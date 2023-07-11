SUMMARY = "Microsoft Azure DNS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.1.0"

RPM_NAME = "python311-azure-mgmt-dns-8.1.0-1.1.noarch.rpm"
RPM_HASH = "fc4c8283af91eb4e9c35241f48036142f4f0fc89e055766b6a75ff51ea0f1377fbadcfce8303c04900e10910dfcad89c49c60a7458820cfc67295c7ddb0788c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dns \
python3.11dist-azure-mgmt-dns \
python311-azure-mgmt-dns \
python3dist-azure-mgmt-dns"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm

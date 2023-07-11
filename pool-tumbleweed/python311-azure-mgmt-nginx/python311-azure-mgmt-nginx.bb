SUMMARY = "Microsoft Azure Nginx Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Nginx Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-azure-mgmt-nginx-2.1.0-1.3.noarch.rpm"
RPM_HASH = "f0087cdc6a0f5abab110371e52c120dbeca718198d9b624d1ee501d317d944689072e6c87cd196cde83f3962658d940924054686ac5283224dca478754276414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-nginx \
python3.11dist-azure-mgmt-nginx \
python311-azure-mgmt-nginx \
python3dist-azure-mgmt-nginx"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

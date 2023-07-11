SUMMARY = "Microsoft Azure App Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure App Configuration Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-mgmt-appconfiguration-3.0.0-1.3.noarch.rpm"
RPM_HASH = "1173d391e176ca98b75633c6ef7641a049dd18346179f48fec58511e7b9a2daf5bfad65313de34278132c9ad1e54452b8d6e19d33037c8e8d8d7fe016b974d54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appconfiguration \
python3.11dist-azure-mgmt-appconfiguration \
python311-azure-mgmt-appconfiguration \
python3dist-azure-mgmt-appconfiguration"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm

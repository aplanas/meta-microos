SUMMARY = "Microsoft Azure App Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure App Configuration Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-mgmt-appconfiguration-3.0.0-1.2.noarch.rpm"
RPM_HASH = "74c6141299d5833028753b91ffdd24f7db8cdf2c56d81d9a1be1a28358536a9cf2bdb039167f1f525ebda361152740f58bb2492d46bdfe7eb431641c7371bfad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appconfiguration \
python3.10dist-azure-mgmt-appconfiguration \
python310-azure-mgmt-appconfiguration \
python3dist-azure-mgmt-appconfiguration"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm

SUMMARY = "Microsoft Azure App Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure App Configuration Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-mgmt-appconfiguration-3.0.0-1.3.noarch.rpm"
RPM_HASH = "5dfd6a1537b3eb167b32e0f0da6fdffe8e9207dad3079abede47ca4e4af382ddbc3e7ec61e38b787ade62b8b66e2b2032fd8488e4980142d774e6a26b03bd095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-appconfiguration \
python310-azure-mgmt-appconfiguration \
python3dist-azure-mgmt-appconfiguration"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm

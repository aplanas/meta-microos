SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.4.0"

RPM_NAME = "python311-azure-mgmt-cognitiveservices-13.4.0-1.3.noarch.rpm"
RPM_HASH = "fcf83b9e27057c9b37737a2fe96ff2f8ded38b8c41bcf5f240252bb2b9cbae675a3c7dcc45addf6a2e0479f4f3dc63da1bd73094de98bbb14813a5f7b215f24d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-cognitiveservices) \
python311-azure-mgmt-cognitiveservices \
python3dist(azure-mgmt-cognitiveservices)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

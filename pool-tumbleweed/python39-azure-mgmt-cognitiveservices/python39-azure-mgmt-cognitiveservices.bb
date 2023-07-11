SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.4.0"

RPM_NAME = "python39-azure-mgmt-cognitiveservices-13.4.0-1.4.noarch.rpm"
RPM_HASH = "f5d8d64551d2131964012810a5740f832ec5a2c5fc9f1885cbaad5901d8df5f355aa704a7931ca4dc49e11f58a7c125a45d46944f7dda5d2bad890a318b04bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-cognitiveservices \
python39-azure-mgmt-cognitiveservices \
python3dist-azure-mgmt-cognitiveservices"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.5.0"

RPM_NAME = "python39-azure-mgmt-cognitiveservices-13.5.0-1.1.noarch.rpm"
RPM_HASH = "16484fc6e721fdbfb3c996c249ee3a95d8e7a35e6ba8a31f879e92e1a1c45a91ebca88255b91b53b8798f8f29cc01d78555668a6c9b1d4fed099e64b38116201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-cognitiveservices \
python39-azure-mgmt-cognitiveservices \
python3dist-azure-mgmt-cognitiveservices"

RDEPENDS:${PN} += "-python39-azure-common >= 1.1 with python39-azure-common < 2.0.0 \
-python39-azure-mgmt-core >= 1.3.2 with python39-azure-mgmt-core < 2.0.0 \
python-abi \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

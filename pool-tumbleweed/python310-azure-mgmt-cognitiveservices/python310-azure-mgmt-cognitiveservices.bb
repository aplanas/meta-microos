SUMMARY = "Microsoft Azure Cognitive Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.5.0"

RPM_NAME = "python310-azure-mgmt-cognitiveservices-13.5.0-1.1.noarch.rpm"
RPM_HASH = "652028cf66ede756dfbd930f7d3441925293a037280f617983c6b79098aa20e7b70c80b359d449591ebb2b6560be0d7134d5bb7980202ce469b5ce84d3dccac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-cognitiveservices \
python310-azure-mgmt-cognitiveservices \
python3dist-azure-mgmt-cognitiveservices"

RDEPENDS:${PN} += "-python310-azure-common >= 1.1 with python310-azure-common < 2.0.0 \
-python310-azure-mgmt-core >= 1.3.2 with python310-azure-mgmt-core < 2.0.0 \
python-abi \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

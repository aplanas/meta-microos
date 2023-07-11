SUMMARY = "Microsoft Azure Machine Learning Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-machinelearningservices-1.0.0-1.11.noarch.rpm"
RPM_HASH = "9c121d87a10ca146a1a4f8f4aa6787e433f9a662ef1452bde29cb3c3ab2fe479d2f12105bcb654ca780471b1329a759ce110d6c203ef7d4d7e9fe0f4b140bf2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-machinelearningservices \
python310-azure-mgmt-machinelearningservices \
python3dist-azure-mgmt-machinelearningservices"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

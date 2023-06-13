SUMMARY = "Microsoft Azure Machine Learning Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-machinelearningservices-1.0.0-1.10.noarch.rpm"
RPM_HASH = "64516b55f35f66cf06696ab1087573f3f70844086134c2886277b83790005a6b6257cd42477171be5a895f8e6fb4ac2fc517a2d17ec843115ac81a4bbbb3f976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-machinelearningservices \
python3.10dist(azure-mgmt-machinelearningservices) \
python310-azure-mgmt-machinelearningservices \
python3dist(azure-mgmt-machinelearningservices)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

SUMMARY = "Microsoft Azure Machine Learning Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-machinelearningservices-1.0.0-1.11.noarch.rpm"
RPM_HASH = "ac191c2219d649d9afcf0b82de5f06740cd37893f6b96756ee41a2be0a679fab2874d6481e006c61d8573117b74f9542f2e1d2bc9f52bc0c861b92b597a80cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-machinelearningservices \
python39-azure-mgmt-machinelearningservices \
python3dist-azure-mgmt-machinelearningservices"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

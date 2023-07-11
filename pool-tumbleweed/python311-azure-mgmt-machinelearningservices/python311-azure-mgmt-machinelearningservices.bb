SUMMARY = "Microsoft Azure Machine Learning Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-machinelearningservices-1.0.0-1.11.noarch.rpm"
RPM_HASH = "707f2a7db4cbc4bded3b16e0d30ba0d1dfe62aea1c8748deb09dc8c37f7dd8a531452c2cc73939b1756de412357de38e04ff78ab755fc7e13d262705c0fb2a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-machinelearningservices \
python3.11dist-azure-mgmt-machinelearningservices \
python311-azure-mgmt-machinelearningservices \
python3dist-azure-mgmt-machinelearningservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

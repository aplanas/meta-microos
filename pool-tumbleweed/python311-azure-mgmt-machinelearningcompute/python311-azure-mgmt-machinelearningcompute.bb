SUMMARY = "Microsoft Azure Machine Learning Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-azure-mgmt-machinelearningcompute-0.4.1-4.12.noarch.rpm"
RPM_HASH = "31bf48cbffba09c1b5ae6feb5dad44e2c05ecf61abd3a876e14e112da038236b8b8158dc13cdd60832eabb70af3946124db5b9adc395521f5e1644ed59b38845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-machinelearningcompute \
python3.11dist-azure-mgmt-machinelearningcompute \
python311-azure-mgmt-machinelearningcompute \
python3dist-azure-mgmt-machinelearningcompute"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm

SUMMARY = "Microsoft Azure Machine Learning Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-azure-mgmt-machinelearningcompute-0.4.1-4.11.noarch.rpm"
RPM_HASH = "3ec0911111a4d8b3c28f974c3a84afd3e61ff73f9238e5938d02ff9dce74d81a3aa72c512811f4b7bbb16d3afbb2c39922be4de43b9bcd2e911af8b10a4c8a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-machinelearningcompute \
python3.10dist-azure-mgmt-machinelearningcompute \
python310-azure-mgmt-machinelearningcompute \
python3dist-azure-mgmt-machinelearningcompute"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm

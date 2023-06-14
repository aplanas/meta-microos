SUMMARY = "Microsoft Azure Machine Learning Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-azure-mgmt-machinelearningcompute-0.4.1-4.11.noarch.rpm"
RPM_HASH = "ed206787ac8abef85ec72d5d56bb324e5116124a3941a3a2d0dc1be6905890f26d8781288c881cbee869683e9de59c62cdea5a868a9292fd25d98bc38465804b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-machinelearningcompute \
python39-azure-mgmt-machinelearningcompute \
python3dist-azure-mgmt-machinelearningcompute"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrestazure"

inherit rpm

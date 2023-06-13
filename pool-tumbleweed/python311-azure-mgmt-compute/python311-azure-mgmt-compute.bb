SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "30.0.0"

RPM_NAME = "python311-azure-mgmt-compute-30.0.0-1.1.noarch.rpm"
RPM_HASH = "6b57a18565276fbb15d426204e79ae1127576be3afb2759a05780ef8128b9c0a9756f47273bc0d6e3c1f2a42ea79cbe057469013e51673666bfcfad132914163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-compute) \
python311-azure-mgmt-compute \
python3dist(azure-mgmt-compute)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm

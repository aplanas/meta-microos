SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python310-azure-mgmt-storage-21.0.0-1.3.noarch.rpm"
RPM_HASH = "ed0316d7e06904923b161138395a90fb6b18fa129f21bfde1abdeb29d2c8209af16b3b7a55be2f072cd1eaef8c4bcd2322096a57a569194960654c2318bd33c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storage \
python3.10dist(azure-mgmt-storage) \
python310-azure-mgmt-storage \
python3dist(azure-mgmt-storage)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

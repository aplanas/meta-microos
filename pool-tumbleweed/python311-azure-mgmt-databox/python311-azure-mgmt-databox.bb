SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-databox-2.0.0-1.1.noarch.rpm"
RPM_HASH = "cc2049090fd450fda743315ab359cc280eb53a7f2c71727493ac0a14f8ac859916a101de7259799afdb0d0824e300b5a0d286dec8fbe8cf32c9e7b87873799dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-databox) \
python311-azure-mgmt-databox \
python3dist(azure-mgmt-databox)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

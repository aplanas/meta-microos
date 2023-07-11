SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mgmt-regionmove-1.0.0b1-2.12.noarch.rpm"
RPM_HASH = "73eb468a036404f4488e52dab47a0d728eb143886b40c55cf56c29008f3765116a7666d4ce3b95ab3bb65e5d5229810e0499494745ba029dd8318e1cee1a274d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-regionmove \
python3.11dist-azure-mgmt-regionmove \
python311-azure-mgmt-regionmove \
python3dist-azure-mgmt-regionmove"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm

SUMMARY = "Microsoft Azure Edgeorder Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgeorder Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-edgeorder-1.0.0.0-1.6.noarch.rpm"
RPM_HASH = "f2216a99140d5c11a3b892ad259b3463bd3241c5a0795eeccc4c34b9343e952fd375115d26ed10e1c77d934fb4a129207f32e98b21b01ae881ed17f91361ec65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-edgeorder \
python3.10dist-azure-mgmt-edgeorder \
python310-azure-mgmt-edgeorder \
python3dist-azure-mgmt-edgeorder"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

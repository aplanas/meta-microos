SUMMARY = "Microsoft Azure Storagepool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagepool Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-storagepool-1.0.0-1.8.noarch.rpm"
RPM_HASH = "f218647916b316d221fd3946fe2b9c70a64373057a046723c56099376d5a140cf11891eab5efb79f10e377887bf706250c16d4b73f8070acc1a053c6fe9b27bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-storagepool) \
python311-azure-mgmt-storagepool \
python3dist(azure-mgmt-storagepool)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

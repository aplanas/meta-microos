SUMMARY = "Microsoft Azure Log Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "13.0.0b5"

RPM_NAME = "python311-azure-mgmt-loganalytics-13.0.0b5-1.4.noarch.rpm"
RPM_HASH = "711653e9dc7d2694557f4895277fc754565052384166c7cc863f8a726a4d152c7108115c1200841e1d052534d8ec67871e07b3f0fbb34aa5b35043824f25b8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-loganalytics \
python3.11dist-azure-mgmt-loganalytics \
python311-azure-mgmt-loganalytics \
python3dist-azure-mgmt-loganalytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

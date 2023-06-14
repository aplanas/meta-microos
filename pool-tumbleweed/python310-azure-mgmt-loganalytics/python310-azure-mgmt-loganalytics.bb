SUMMARY = "Microsoft Azure Log Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "13.0.0b5"

RPM_NAME = "python310-azure-mgmt-loganalytics-13.0.0b5-1.3.noarch.rpm"
RPM_HASH = "fcf996efaac471e30787e82963ae3a35c773c0b6d565c0cf5f4fde3e06f0cd27a6da02396aeab241f4ad5b88d887805ad33e3fc2c59f0936eb3598dd50e68584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-loganalytics \
python3.10dist-azure-mgmt-loganalytics \
python310-azure-mgmt-loganalytics \
python3dist-azure-mgmt-loganalytics"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

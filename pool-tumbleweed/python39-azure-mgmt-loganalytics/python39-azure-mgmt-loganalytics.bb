SUMMARY = "Microsoft Azure Log Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "13.0.0b5"

RPM_NAME = "python39-azure-mgmt-loganalytics-13.0.0b5-1.4.noarch.rpm"
RPM_HASH = "dd526f71d9af86fe3580c169cef5daad1f0f8e6491450edf52250bc7e70860937ea09b99a0fa49112f5282e09261c1c8d18c611ac0794074d05feabd002b7c46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-loganalytics \
python39-azure-mgmt-loganalytics \
python3dist-azure-mgmt-loganalytics"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

SUMMARY = "Microsoft Azure SerialConsole Client Library"
DESCRIPTION = "This is the Microsoft Azure SerialConsole Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-serialconsole-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "883099c8693051efe5e4f0339a9a647b0f9dafb30f57618fe55b0017c28321af72f5089e2f687c340cdf3915d1cbc9c1c022d456b5e5d25abb29e2b9b469fea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-serialconsole) \
python311-azure-mgmt-serialconsole \
python3dist(azure-mgmt-serialconsole)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

SUMMARY = "Microsoft Azure IoTCentral Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTCentral Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0b2"

RPM_NAME = "python311-azure-mgmt-iotcentral-10.0.0b2-1.4.noarch.rpm"
RPM_HASH = "5045c04f2352656137b1f14adb97c5a10916775f39a9d522e1bde3af06aa6d2dfa48bbbc633c6d2992ca79bc26ca79f8c3050d7310f5df2954a8a7bbaf60fecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iotcentral \
python3.11dist-azure-mgmt-iotcentral \
python311-azure-mgmt-iotcentral \
python3dist-azure-mgmt-iotcentral"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-msrest"

inherit rpm

SUMMARY = "Microsoft Azure IoTHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-azure-mgmt-iothub-2.4.0-1.1.noarch.rpm"
RPM_HASH = "bc3a0b0aac71f3426f1ddb150c5183912ddfe8fc78f6091f0e0f0ab407b652db839d8b068a27448a65b884b4334eaf28951c558ba9d66b09312b6f107e3db364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-iothub \
python311-azure-mgmt-iothub \
python3dist-azure-mgmt-iothub"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm

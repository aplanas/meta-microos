SUMMARY = "Microsoft Azure IoTHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-azure-mgmt-iothub-2.4.0-1.2.noarch.rpm"
RPM_HASH = "cfc4920c56ed7470d7485a0eacbcbe217ec56e8d821aa16678503a34a54ddf797d469476e72a77f8ebe11f7699884f47242dfabc7a2202432949cdc6fe2ab77a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iothub \
python3.11dist-azure-mgmt-iothub \
python311-azure-mgmt-iothub \
python3dist-azure-mgmt-iothub"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm

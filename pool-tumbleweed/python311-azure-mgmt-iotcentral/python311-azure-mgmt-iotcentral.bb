SUMMARY = "Microsoft Azure IoTCentral Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTCentral Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0b2"

RPM_NAME = "python311-azure-mgmt-iotcentral-10.0.0b2-1.3.noarch.rpm"
RPM_HASH = "0d01db455fc9904f3c37582b92ef95b880507a1373ead935c5ed817bbd64e2bcdd6ad898f8c45238053ebb3d187be50d61e80ace5d9ca52f9730b1e251084a95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-iotcentral) \
python311-azure-mgmt-iotcentral \
python3dist(azure-mgmt-iotcentral)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-msrest"

inherit rpm

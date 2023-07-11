SUMMARY = "Microsoft Azure IoTCentral Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTCentral Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0b2"

RPM_NAME = "python39-azure-mgmt-iotcentral-10.0.0b2-1.4.noarch.rpm"
RPM_HASH = "f05c8bad31b6f67908437ab6e583eb4c9675596dac1039697034b98d0aaa2917ca3a48d55b9f21ee8226a0424426df57b058b7263db920fca50c2d45b6d88421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-iotcentral \
python39-azure-mgmt-iotcentral \
python3dist-azure-mgmt-iotcentral"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-msrest"

inherit rpm

SUMMARY = "Microsoft Azure IoTCentral Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTCentral Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0b2"

RPM_NAME = "python310-azure-mgmt-iotcentral-10.0.0b2-1.4.noarch.rpm"
RPM_HASH = "7782308a70c444ad44e83b9cddcb32b93f4371b429fc4e8b9d81bd04fc678886e5a3391a9c01ff6f1a4caa5ec1d995cf6530d98f506f2aca3d33c4ee012d3d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-iotcentral \
python310-azure-mgmt-iotcentral \
python3dist-azure-mgmt-iotcentral"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-msrest"

inherit rpm

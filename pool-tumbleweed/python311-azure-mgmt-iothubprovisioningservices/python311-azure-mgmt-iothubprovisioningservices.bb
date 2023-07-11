SUMMARY = "Microsoft Azure IoTHub Provisioning Services Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Provisioning Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-iothubprovisioningservices-1.1.0-1.7.noarch.rpm"
RPM_HASH = "111710b9c31a9e6c224c676ef9e8b60af5d6fa1fb55e555e829d1d11d3bcef5ca6f4fdac345c07666025592591e861a709ddbd8aae2b818b7f153344cdccd474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iothubprovisioningservices \
python3.11dist-azure-mgmt-iothubprovisioningservices \
python311-azure-mgmt-iothubprovisioningservices \
python3dist-azure-mgmt-iothubprovisioningservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

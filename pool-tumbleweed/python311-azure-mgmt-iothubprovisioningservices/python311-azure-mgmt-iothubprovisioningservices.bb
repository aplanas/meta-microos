SUMMARY = "Microsoft Azure IoTHub Provisioning Services Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Provisioning Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-iothubprovisioningservices-1.1.0-1.6.noarch.rpm"
RPM_HASH = "7db17b6921d9bc6f39a142a62d50b00958464b23432b167879b5a00241ef945e5b7f5fb6811dee0024c536e036b10260bcc6d21860b3faec475e2dcaf221ad25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-iothubprovisioningservices \
python311-azure-mgmt-iothubprovisioningservices \
python3dist-azure-mgmt-iothubprovisioningservices"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

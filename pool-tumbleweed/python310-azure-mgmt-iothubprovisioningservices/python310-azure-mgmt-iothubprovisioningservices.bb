SUMMARY = "Microsoft Azure IoTHub Provisioning Services Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Provisioning Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-iothubprovisioningservices-1.1.0-1.7.noarch.rpm"
RPM_HASH = "5b3437a25fffefe7556b7bd7ccae64943d22743022b95369806eb561e68c39699817847a3d6b9304733771f4866e0da6d48cb6724dd18b2f20b7e909d78990be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-iothubprovisioningservices \
python310-azure-mgmt-iothubprovisioningservices \
python3dist-azure-mgmt-iothubprovisioningservices"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

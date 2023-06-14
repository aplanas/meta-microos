SUMMARY = "Microsoft Azure IoTHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-azure-mgmt-iothub-2.4.0-1.1.noarch.rpm"
RPM_HASH = "0071eca3a561f40acbf658d76ec1e17e274135873ee8c769e39fb5ec8ba6176654c1b64bf3ee45c83853f341a6591a71efd324a7c4f0d510a6a741b9bd1fe2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-iothub \
python39-azure-mgmt-iothub \
python3dist-azure-mgmt-iothub"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm

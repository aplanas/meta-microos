SUMMARY = "Azure Device Update for IoT Hub client library for Python"
DESCRIPTION = "The library provides access to the Device Update for IoT Hub service that \
enables customers to publish updates for their IoT devices to the cloud, \
and then deploy these updates to their devices (approve updates to groups \
of devices managed and provisioned in IoT Hub)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-iot-deviceupdate-1.0.0-1.4.noarch.rpm"
RPM_HASH = "3659144f959876e2b1afced0c1b5ff125a91d973e36a7346227c6d8d29590ffb9180e3e27757e51de06d29ab8527935e5dfc64df95ccaa1881ac2264a5caa46c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-iot-deviceupdate \
python39-azure-iot-deviceupdate \
python3dist-azure-iot-deviceupdate"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-iot-nspkg \
python39-isodate"

inherit rpm

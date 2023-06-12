SUMMARY = "Azure Device Update for IoT Hub client library for Python"
DESCRIPTION = "The library provides access to the Device Update for IoT Hub service that \
enables customers to publish updates for their IoT devices to the cloud, \
and then deploy these updates to their devices (approve updates to groups \
of devices managed and provisioned in IoT Hub)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-iot-deviceupdate-1.0.0-1.3.noarch.rpm"
RPM_HASH = "4603a4b70f430933c5d3563f7b7d096c258d4642e15c401ce790e677c444e6d3bfffd1dfb8346ee4639c760509d6f656c3300870ff87ccbacf86091c8c6e5929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-iot-deviceupdate \
python3.10dist(azure-iot-deviceupdate) \
python310-azure-iot-deviceupdate \
python3dist(azure-iot-deviceupdate)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-core \
python310-azure-iot-nspkg \
python310-isodate"

inherit rpm

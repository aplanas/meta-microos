SUMMARY = "Azure Device Update for IoT Hub client library for Python"
DESCRIPTION = "The library provides access to the Device Update for IoT Hub service that \
enables customers to publish updates for their IoT devices to the cloud, \
and then deploy these updates to their devices (approve updates to groups \
of devices managed and provisioned in IoT Hub)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-iot-deviceupdate-1.0.0-1.4.noarch.rpm"
RPM_HASH = "20fc52a3691d90d86c499422ddafb362cd38063a258c60a4f52c60b77228e6abc01378f10a68a0c5770069e8f8158607926dbc1c1baf8374ccec47e04c3c5521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-iot-deviceupdate \
python310-azure-iot-deviceupdate \
python3dist-azure-iot-deviceupdate"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-iot-nspkg \
python310-isodate"

inherit rpm

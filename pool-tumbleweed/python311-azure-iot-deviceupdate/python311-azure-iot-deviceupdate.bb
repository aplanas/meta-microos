SUMMARY = "Azure Device Update for IoT Hub client library for Python"
DESCRIPTION = "The library provides access to the Device Update for IoT Hub service that \
enables customers to publish updates for their IoT devices to the cloud, \
and then deploy these updates to their devices (approve updates to groups \
of devices managed and provisioned in IoT Hub)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-iot-deviceupdate-1.0.0-1.4.noarch.rpm"
RPM_HASH = "c37af0f1d34fdb0561603ef1d3c36297e8bfcd47cb7ab1e34b7acd1937a0aedd159548115826134342d2524b7464a98ab34490c471ca86ad26d946416dcb4bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-iot-deviceupdate \
python3.11dist-azure-iot-deviceupdate \
python311-azure-iot-deviceupdate \
python3dist-azure-iot-deviceupdate"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-iot-nspkg \
python311-isodate"

inherit rpm

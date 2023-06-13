SUMMARY = "Azure Device Update for IoT Hub client library for Python"
DESCRIPTION = "The library provides access to the Device Update for IoT Hub service that \
enables customers to publish updates for their IoT devices to the cloud, \
and then deploy these updates to their devices (approve updates to groups \
of devices managed and provisioned in IoT Hub)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-iot-deviceupdate-1.0.0-1.3.noarch.rpm"
RPM_HASH = "db15f9e38a1d63a787a4149ba8abb736cc40598baf5bbade4d680782f8abb53d137298a1cd7785b6742680b34e7ebe09b8f6e4e27515f32c8ce65247859f959c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-iot-deviceupdate) \
python311-azure-iot-deviceupdate \
python3dist(azure-iot-deviceupdate)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-core \
python311-azure-iot-nspkg \
python311-isodate"

inherit rpm

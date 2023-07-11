SUMMARY = "Microsoft Azure IoT namespace package"
DESCRIPTION = "This is the Microsoft Azure IoT namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.iot namespace."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-azure-iot-nspkg-1.0.1-1.3.noarch.rpm"
RPM_HASH = "0ad0057af1576e55c6adea004b9c2faf7e702d8f07b6fa222dd3c2aaffa3f7e42193661cd0e3cc1bba43920d392d251d3b2175d0143991ae53af032d3ace9de4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-iot-nspkg \
python3.11dist-azure-iot-nspkg \
python311-azure-iot-nspkg \
python3dist-azure-iot-nspkg"

RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm

SUMMARY = "Microsoft Azure IoT namespace package"
DESCRIPTION = "This is the Microsoft Azure IoT namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.iot namespace."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-azure-iot-nspkg-1.0.1-1.2.noarch.rpm"
RPM_HASH = "35b5171534e3d3e0ddfbc62d55373629589cfb6b114ea66626523c629f7bac5582d4630af50502c86515db2d0f955ad05356afa3d8db54263068d42305fe7053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-iot-nspkg \
python3.10dist-azure-iot-nspkg \
python310-azure-iot-nspkg \
python3dist-azure-iot-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm

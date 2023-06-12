SUMMARY = "Microsoft Azure IoT namespace package"
DESCRIPTION = "This is the Microsoft Azure IoT namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.iot namespace."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python38-azure-iot-nspkg-1.0.1-1.2.noarch.rpm"
RPM_HASH = "87a1014543eda4007591da46457e67dfb5b01a542373208ea49dc0f7421356bf67045f5b9a626fc96d261510251c985d5831e7d5da2aa25502b09c02d142568c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-iot-nspkg) \
python38-azure-iot-nspkg \
python3dist(azure-iot-nspkg)"
RDEPENDS:${PN} += "python38-azure-nspkg"

inherit rpm

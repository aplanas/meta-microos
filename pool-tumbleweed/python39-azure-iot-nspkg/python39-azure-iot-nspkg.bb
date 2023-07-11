SUMMARY = "Microsoft Azure IoT namespace package"
DESCRIPTION = "This is the Microsoft Azure IoT namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.iot namespace."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-azure-iot-nspkg-1.0.1-1.3.noarch.rpm"
RPM_HASH = "37fadcff6bf0f323dd40e681784a8a2aa031088f7903d639da1a81e20fdc972c7cb3df5838affa4c951589f6fd725e1738d54e808ce98155d843888979b15725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-iot-nspkg \
python39-azure-iot-nspkg \
python3dist-azure-iot-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm

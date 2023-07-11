SUMMARY = "Microsoft Azure IoT namespace package"
DESCRIPTION = "This is the Microsoft Azure IoT namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.iot namespace."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-azure-iot-nspkg-1.0.1-1.3.noarch.rpm"
RPM_HASH = "634946a10aa4408cdcc2da19b7afc9f96314eb0238a36b6b6baa7a8ceb3433d65415e717e2b12f1d505fed843e3ab2a7731d682e4e1bb60078c3b9e08a248714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-iot-nspkg \
python310-azure-iot-nspkg \
python3dist-azure-iot-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm

SUMMARY = "USB access on the Python language"
DESCRIPTION = "Provides USB access to the Python language."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-pyusb-1.2.1-1.10.noarch.rpm"
RPM_HASH = "9d3264bbc2c826a3fa62c4fdb364636ebb310ff1c29940590555adace9e3b9dc1f4fed96e029d6136ad362ee9974fe3805adff9e617ec17492833ea0d9b4da6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyusb \
python39-pyusb \
python39-usb \
python3dist-pyusb"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm

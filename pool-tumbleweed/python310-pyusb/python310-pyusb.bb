SUMMARY = "USB access on the Python language"
DESCRIPTION = "Provides USB access to the Python language."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-pyusb-1.2.1-1.10.noarch.rpm"
RPM_HASH = "ffacc9ffb4716f67c0ebec5298160df0c61fb82571f01d03f1204f3002511d59224682e26fb24427f0ac45010f57ecf20e1f9d0caf28aba918f5bcdfa85a6b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyusb \
python310-pyusb \
python310-usb \
python3dist-pyusb"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm

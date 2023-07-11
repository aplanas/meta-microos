SUMMARY = "Python wrapper for libusb-1.0"
DESCRIPTION = "This is a pure python wrapper for libusb-1.0."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "python39-libusb1-3.0.0-1.7.noarch.rpm"
RPM_HASH = "36b1751179e30cb8ff633723d1cf7b17e2b96b11ed917747f97677df78ba361a472834f8427d91bc41eecc8515a862fcc191e73b9cc04b062dd367df1c6b3c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libusb1 \
python39-libusb1 \
python3dist-libusb1"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm

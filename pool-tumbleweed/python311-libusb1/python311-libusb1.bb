SUMMARY = "Python wrapper for libusb-1.0"
DESCRIPTION = "This is a pure python wrapper for libusb-1.0."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "python311-libusb1-3.0.0-1.6.noarch.rpm"
RPM_HASH = "4960f40320c43a6ba53bc45a06b363010f749d53aba7f24d5a60a02aa0ee9c1d81bc92920061175b9cfea2ef9bfaacb6af283b0bec32c9f248031a7d968cb179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-libusb1 \
python311-libusb1 \
python3dist-libusb1"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm

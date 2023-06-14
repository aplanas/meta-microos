SUMMARY = "Python wrapper for libusb-1.0"
DESCRIPTION = "This is a pure python wrapper for libusb-1.0."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "python39-libusb1-3.0.0-1.6.noarch.rpm"
RPM_HASH = "0a4fbd8fe45a0b5b98a1fbe237ae01fe3396757dda3f5bd9da29d7d6c65d317d33e6fb469ba317ac8ea1a9c7eaef3a16a4e28119f2a2742b21c3a6381d454db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libusb1 \
python39-libusb1 \
python3dist-libusb1"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm

SUMMARY = "Python wrapper for libusb-1.0"
DESCRIPTION = "This is a pure python wrapper for libusb-1.0."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "python310-libusb1-3.0.0-1.6.noarch.rpm"
RPM_HASH = "4a35d8690284a2a44aaa12fb8183309b870226ddc7e74f44e08f5d84001f7fadf98a166b35771ad6099945d84baee9638aa0aa66b82f8e2871c624df7615d335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libusb1 \
python3.10dist(libusb1) \
python310-libusb1 \
python3dist(libusb1)"

RDEPENDS:${PN} += "libusb-1_0-0 \
python(abi)"

inherit rpm

SUMMARY = "Python wrapper for libusb-1.0"
DESCRIPTION = "This is a pure python wrapper for libusb-1.0."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "python311-libusb1-3.0.0-1.7.noarch.rpm"
RPM_HASH = "f990a17f6739e59d596e4e2505f21fed11cce26f979ca24767c91e0352cd67b29d0d6e14f76adaa6b1fbb15cb5c207e07f8d1f86189b6825457e35379bbc1ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libusb1 \
python3.11dist-libusb1 \
python311-libusb1 \
python3dist-libusb1"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm

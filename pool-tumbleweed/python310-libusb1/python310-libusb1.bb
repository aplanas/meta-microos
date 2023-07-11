SUMMARY = "Python wrapper for libusb-1.0"
DESCRIPTION = "This is a pure python wrapper for libusb-1.0."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "python310-libusb1-3.0.0-1.7.noarch.rpm"
RPM_HASH = "223b62fb7daefe494d0febe3a36df2820a35542f596ca98e7b751852c0588e197f686cd873a920a55de486a6ef12b8e1ec31bc3f81bfad18a7c74c72abbecbd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-libusb1 \
python310-libusb1 \
python3dist-libusb1"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm

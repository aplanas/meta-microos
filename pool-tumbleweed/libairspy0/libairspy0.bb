SUMMARY = "Driver for Airspy"
DESCRIPTION = "Library to run Airspy SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "libairspy0-1.0.10-1.9.aarch64.rpm"
RPM_HASH = "d5b7912ee6db69789fa0fbdab94f5a2a28c0196cb58aade57d8a4b72cb782bfd4f8b5476dfa33ab21db1ab86f6eb094c7ed94793748663d40f9cfdcc433a32ec"

RPROVIDES:${PN} += "libairspy.so.0 \
libairspy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
airspy-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm

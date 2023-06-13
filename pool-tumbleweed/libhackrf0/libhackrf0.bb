SUMMARY = "Driver for HackRF"
DESCRIPTION = "Library to run HackRF, an open source hardware project to build a Software \
Defined Radio (SDR) peripheral."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "libhackrf0-2023.01.1-1.2.aarch64.rpm"
RPM_HASH = "a9b22609cd748752ccfa1fba10db172eb5638bdfa0aba38e4f415471dc55686b7344ac809c817f93677991344e64b07bd161df422cc1e0394d7044ea4b224bf9"

RPROVIDES:${PN} += "libhackrf.so.0()(64bit) \
libhackrf0 \
libhackrf0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hackrf-udev \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm

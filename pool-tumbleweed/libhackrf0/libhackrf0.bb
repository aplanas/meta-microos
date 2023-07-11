SUMMARY = "Driver for HackRF"
DESCRIPTION = "Library to run HackRF, an open source hardware project to build a Software \
Defined Radio (SDR) peripheral."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "libhackrf0-2023.01.1-1.3.aarch64.rpm"
RPM_HASH = "5ea6f3b8e91a3ae00141b1e4414094743879b2a3ffa72063d86992c526ea262321bc923f05196b892af5575f15343988f08e9c63f0a2b900025719f3f6f8adad"

RPROVIDES:${PN} += "libhackrf.so.0 \
libhackrf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
hackrf-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm

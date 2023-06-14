SUMMARY = "C interface of the Ham Radio Control Libraries"
DESCRIPTION = "Hamlib provides a programming interface for controlling radios and \
other shack hardware. It is a software layer, not a complete user \
application."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "libhamlib4-4.5.5-2.1.aarch64.rpm"
RPM_HASH = "1444682db55c2fee1f285d07a6087dedc9a83b0464fe540bc996240a42f38093438c838c01eeb40f121445fed5de5eff87631b3c025a85b86be148c68e5cb322"

RPROVIDES:${PN} += "libhamlib.so.4 \
libhamlib4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libusb-1.0.so.0"

inherit rpm

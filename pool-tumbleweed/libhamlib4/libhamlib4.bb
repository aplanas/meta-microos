SUMMARY = "C interface of the Ham Radio Control Libraries"
DESCRIPTION = "Hamlib provides a programming interface for controlling radios and \
other shack hardware. It is a software layer, not a complete user \
application."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "libhamlib4-4.5.5-2.2.aarch64.rpm"
RPM_HASH = "9138588dfba73049197550e248c5f1a733d4dc5f041697716bc9483ff49cc5fa65b0b1692f5241c5c6cc6fa440825dc8b105b83ed3be029337d63f90bfa0d9c7"

RPROVIDES:${PN} += "libhamlib.so.4 \
libhamlib4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libusb-1.0.so.0"

inherit rpm

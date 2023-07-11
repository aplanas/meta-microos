SUMMARY = "USB gadget device configuration library"
DESCRIPTION = "libusbgx is a C library encapsulating the kernel USB gadget-configfs \
userspace API functionality."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libusbgx2-0.2.0-1.14.aarch64.rpm"
RPM_HASH = "cd666d5427036afa841ae605d8ff30c0fd925e4f3858b53e99b9cfef4d4f0e3b419f489c8651d8244aeeb4f04a665c73f57b7f4ac3cdf95891d4aa9343193238"

RPROVIDES:${PN} += "libusbgx.so.2 \
libusbgx2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11"

inherit rpm

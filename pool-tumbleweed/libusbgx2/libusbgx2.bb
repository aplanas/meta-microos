SUMMARY = "USB gadget device configuration library"
DESCRIPTION = "libusbgx is a C library encapsulating the kernel USB gadget-configfs \
userspace API functionality."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libusbgx2-0.2.0-1.13.aarch64.rpm"
RPM_HASH = "669c3524614eaae566f8dd0906825e84d5096168860843ebc5a95e1d80372d3c66d6c9378040f0b76e2825c3d7e8c22251943781657a1acf402249c8383d2bd0"

RPROVIDES:${PN} += "libusbgx.so.2 \
libusbgx2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11"

inherit rpm

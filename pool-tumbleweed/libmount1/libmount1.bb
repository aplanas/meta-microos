SUMMARY = "Device mount library"
DESCRIPTION = "Library designed to be used in low-level utils like \
mount(8) and /usr/sbin/mount.<type> helpers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libmount1-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "2d518e8a1ccf07969295b703d8ec9c312b9cc2c1b23e8bbf873e4b902df90c82e8e27f33d28d931bcdc6f4409c711d18c4a27207e563c795ce891c4c321a9834"

RPROVIDES:${PN} += "libmount.so.1 \
libmount1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm

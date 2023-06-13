SUMMARY = "Device mount library"
DESCRIPTION = "Library designed to be used in low-level utils like \
mount(8) and /usr/sbin/mount.<type> helpers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libmount1-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "c47992d8136ead4ac28019dd9bea3b2e12f3cc185d64ad609eeb8a620131f0e30911303e74484bca3f02d820dda2dcd9c6955eca852b6b32f9b808742fe0ade8"

RPROVIDES:${PN} += "libmount.so.1()(64bit) \
libmount.so.1(MOUNT_2_35)(64bit) \
libmount.so.1(MOUNT_2_37)(64bit) \
libmount.so.1(MOUNT_2_38)(64bit) \
libmount1 \
libmount1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libselinux.so.1()(64bit)"

inherit rpm

SUMMARY = "Device mount library"
DESCRIPTION = "Library designed to be used in low-level utils like \
mount(8) and /usr/sbin/mount.<type> helpers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libmount1-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "abdaabe1304be3a1f61e32d7bae9ec2aee2320354d232516f5d92f9645258eccc95b6807de3204eecc3aa82e3f9c148932b88cb12b75edf3d435832e8223f1d4"

RPROVIDES:${PN} += "libmount.so.1 \
libmount1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm

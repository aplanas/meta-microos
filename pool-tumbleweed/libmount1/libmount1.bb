SUMMARY = "Device mount library"
DESCRIPTION = "Library designed to be used in low-level utils like \
mount(8) and /usr/sbin/mount.<type> helpers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libmount1-2.39-3.1.aarch64.rpm"
RPM_HASH = "165022662bbb0df9531815bdc7b54351b3709361b16ab145793cc7df1966b8437508efde8535f5682cfbb2e66503ef6819078b8c75f9bd54b4692340eb7b7785"

RPROVIDES:${PN} += "libmount.so.1 \
libmount1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm

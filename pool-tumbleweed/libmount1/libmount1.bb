SUMMARY = "Device mount library"
DESCRIPTION = "Library designed to be used in low-level utils like \
mount(8) and /usr/sbin/mount.<type> helpers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libmount1-2.39-1.1.aarch64.rpm"
RPM_HASH = "85ac6c16722caf5d775d996da731c521c99d23ba58cf296acaa643c266e3958a2b6362e34646f0156dc9c46357acb0e368e707338b933d541d54c91414c1d856"

RPROVIDES:${PN} += "libmount.so.1 \
libmount1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm

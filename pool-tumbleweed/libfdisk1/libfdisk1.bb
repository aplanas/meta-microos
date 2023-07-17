SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libfdisk1-2.39-2.1.aarch64.rpm"
RPM_HASH = "bc21dfd69c5f76470f65a36629bb7dc910793820146a21f94d8802cc56b99af4814d8cfb39f734631231a777003d7bb0c0a3dedd29f4742076de495bcd8bd71b"

RPROVIDES:${PN} += "libfdisk.so.1 \
libfdisk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm

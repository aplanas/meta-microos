SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libfdisk1-2.39-3.1.aarch64.rpm"
RPM_HASH = "2cb38a3ef4fa029396fe23d101ea7e98dc56ce8010be989c30177d393d7e40180f0ce85b8d893128885d93652c2ca27821a12dd016002dafdc38a32d19150adb"

RPROVIDES:${PN} += "libfdisk.so.1 \
libfdisk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm

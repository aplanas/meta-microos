SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libfdisk1-2.39-1.1.aarch64.rpm"
RPM_HASH = "8b3b8e992a877b8b873db073bb52d48b609957ee52752f3939faa8465be00aa417ad44da46526c799c37338cd719e3125241630688205fc552410f1ced6631dd"

RPROVIDES:${PN} += "libfdisk.so.1 \
libfdisk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm

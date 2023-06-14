SUMMARY = "Library for Terminal Handling"
DESCRIPTION = "This contain the library for handling terminals for termrec"
LICENSE = "LGPL-2.0-or-later"

PV = "0.19"

RPM_NAME = "libtty1-0.19-1.13.aarch64.rpm"
RPM_HASH = "0526bd26d9f7f60ef6e5af9f45a071dc781fee73613bbe598021a8ab3cd007a2ba3596c9e4272a5be63c0835ea7f13c06d0324837c3d6cf8e350e4fd52184bfe"

RPROVIDES:${PN} += "libtty.so.1 \
libtty1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libz.so.1"

inherit rpm

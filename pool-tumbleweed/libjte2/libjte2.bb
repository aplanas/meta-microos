SUMMARY = "Jigdo Template Export Library"
DESCRIPTION = "libjte is a library providing support for creating jigdo files, to be used by \
ISO image creation tools."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22"

RPM_NAME = "libjte2-1.22-1.11.aarch64.rpm"
RPM_HASH = "4b2d5a2834d511b47f282d09a58362e4c5225b3af64bfa5b3774e4dd9c82234a114bf53156c22c3afb78f690556470646d03c0a9fe113411ecb1edc9855309e4"

RPROVIDES:${PN} += "libjte.so.2 \
libjte2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm

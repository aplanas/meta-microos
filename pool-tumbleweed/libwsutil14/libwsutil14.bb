SUMMARY = "Library for wireshark utilities"
DESCRIPTION = "The libwsutil library provides utility functions for libwireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.7"

RPM_NAME = "libwsutil14-4.0.7-2.1.aarch64.rpm"
RPM_HASH = "ac168c1f3f166d7ada006381b266799370ae897b9a8393d317054810be2fbccdc48084c62deaf2cf6bc6b6b9d47a60e9b628b1ba1d862daf01b134931c4dfbc8"

RPROVIDES:${PN} += "libwsutil.so.14 \
libwsutil14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libpcre2-8.so.0"

inherit rpm

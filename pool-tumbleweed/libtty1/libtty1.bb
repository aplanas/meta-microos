SUMMARY = "Library for Terminal Handling"
DESCRIPTION = "This contain the library for handling terminals for termrec"
LICENSE = "LGPL-2.0-or-later"

PV = "0.19"

RPM_NAME = "libtty1-0.19-1.14.aarch64.rpm"
RPM_HASH = "53428e66488d96e17c8bf0fda969689762d2f0163c76f2acfa63d7981a23109e7c1dba088beb9afefa601a8467a0f508f228754caa37eba8d9eb28028814a4f7"

RPROVIDES:${PN} += "libtty.so.1 \
libtty1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libz.so.1"

inherit rpm

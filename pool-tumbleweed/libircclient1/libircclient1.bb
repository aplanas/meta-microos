SUMMARY = "Library implementing client-server IRC protocol"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient1-1.10-1.14.aarch64.rpm"
RPM_HASH = "331d88090d9a1571421c5fd9dd5930e0707a0299483ea5203cbd0b624dc668ab04eaa67e1e6c0195413906955339662677fd1265c19278062b22d638a1b3d629"

RPROVIDES:${PN} += "libircclient.so.1 \
libircclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm

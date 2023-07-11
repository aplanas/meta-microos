SUMMARY = "Progressive Graphics File Library"
DESCRIPTION = "libpgf is a library for working with PGF (Progresive Graphics File) images."
LICENSE = "LGPL-2.1-or-later"

PV = "7.21.7"

RPM_NAME = "libpgf7-7.21.7-1.11.aarch64.rpm"
RPM_HASH = "c604750e3dc78980496a9482d85ab82fc599c6fb81452b814395c7264916af458226a657333b58ef7111d9350732d9c0cba5c30728757cf2f1b30ba20342fd06"

RPROVIDES:${PN} += "libpgf.so.7 \
libpgf7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

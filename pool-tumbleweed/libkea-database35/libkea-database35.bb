SUMMARY = "Kea database abstraction library"
DESCRIPTION = "Kea's database abstraction library."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-database35-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "10270e0bc6af925dd96d223e30c0a2ebe585b45926777c69d8ec319d34db15b8f359bfd58244df0dc1b61a374c31692ae1086d49eac9eb2035923240abc2df0e"

RPROVIDES:${PN} += "libkea-database.so.35 \
libkea-database35"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cc.so.39 \
libkea-exceptions.so.13 \
libkea-log.so.35 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm

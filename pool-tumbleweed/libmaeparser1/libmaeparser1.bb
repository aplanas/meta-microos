SUMMARY = "The maeparser shared library"
DESCRIPTION = "This package contains the maeparser shared library."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libmaeparser1-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "a989a70efda976bb0e94e54df57b5c2fe64783f36f3bc85c2c532ded019e117ffb3db05ebfde188b56e3ecf6009a9470089fd6e3decfe1e4bbac3a1731510ad8"

RPROVIDES:${PN} += "libmaeparser.so.1 \
libmaeparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

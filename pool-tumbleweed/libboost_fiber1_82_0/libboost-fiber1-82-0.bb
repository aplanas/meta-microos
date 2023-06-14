SUMMARY = "Boost.Fiber runtime library"
DESCRIPTION = "This package contains Boost.Fiber runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_fiber1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "2b0a35d8156854f88b1daa34dcc0c959bbf32816ae07593da69213090268922b1505f53b18a4f7be797fb0d32f508ee5ea28b815e42161addd1da9fbbeb638a6"

RPROVIDES:${PN} += "libboost-fiber.so.1.82.0 \
libboost-fiber1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libboost-context.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

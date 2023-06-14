SUMMARY = "Boost.Random runtime library"
DESCRIPTION = "This package contains the Boost.Random runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_random1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "b8606692fa35658525838898e47405ca4169b0e8aaacd9d34a936b331bf6d4d46ae90ee9db828a5b47b1cf0f7e29261af51cb3fd34125be11b6bf37b8181dee1"

RPROVIDES:${PN} += "libboost-random.so.1.82.0 \
libboost-random1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Boost.Regex runtime library"
DESCRIPTION = "This package contains the Boost.Regex runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_regex1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "f0ebe9c4c9b96967915a131ff4f1c3007b18c02dc32a975511c688a110a2208f52de66381833d8376b77d7463446347f2c940c2ca7e437b611b81cbef2e5fdb2"

RPROVIDES:${PN} += "libboost-regex.so.1.82.0 \
libboost-regex1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Boost.Thread runtime libraries"
DESCRIPTION = "This package contains the Boost.Thread runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_thread1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "aa59856f0914d266bd083dcd4dc93d5614367d735718e164c594aa4698776dc19671dfc1a3f50719643b317de857d7482ea27a356ef78ca7907b613c379dda66"

RPROVIDES:${PN} += "libboost-thread.so.1.82.0 \
libboost-thread1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

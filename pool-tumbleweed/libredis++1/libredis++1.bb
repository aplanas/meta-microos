SUMMARY = "C++ client for Redis"
DESCRIPTION = "Redis-plus-plus, a C++ client for Redis based on hiredis and written in C++11/C++17."
LICENSE = "Apache-2.0"

PV = "1.3.8"

RPM_NAME = "libredis++1-1.3.8-1.2.aarch64.rpm"
RPM_HASH = "18a82fd5000fc2d249cccc2ab09a535abcc83352cafd07169201218613345dc60dd1dcac58f835fe964e0adba17ad541dc9b0186eb638af67e8e47c1b71036d9"

RPROVIDES:${PN} += "libredis++.so.1 \
libredis++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhiredis-ssl.so.1.1.0 \
libhiredis.so.1.1.0 \
libstdc++.so.6 \
libuv.so.1"

inherit rpm

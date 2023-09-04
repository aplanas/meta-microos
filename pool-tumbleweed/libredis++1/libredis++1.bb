SUMMARY = "C++ client for Redis"
DESCRIPTION = "Redis-plus-plus, a C++ client for Redis based on hiredis and written in C++11/C++17."
LICENSE = "Apache-2.0"

PV = "1.3.10"

RPM_NAME = "libredis++1-1.3.10-1.1.aarch64.rpm"
RPM_HASH = "8d7fa4d006162f3c00535f2039c8ac6b18415f021a5f9761adb4ae7ed383de9c125a242082658f59c05d014606cba5bcf39e032eae6a85fe1e0c0812e02c63f0"

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

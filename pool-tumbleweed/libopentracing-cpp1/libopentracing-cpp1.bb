SUMMARY = "OpenTracing C++ API"
DESCRIPTION = "C++ implementation of the OpenTracing API."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libopentracing-cpp1-1.6.0-1.10.aarch64.rpm"
RPM_HASH = "2a111ac91d5ff6d8c20eef6f8f39b967c6df4d12565f6fbe9db86fc460413d3fc003415f5766c072234c600af9d421fb5727965cc833885eb331026e1cf9fec7"

RPROVIDES:${PN} += "cmake-OpenTracing \
libopentracing-cpp1 \
libopentracing-mocktracer.so.1 \
libopentracing.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "OpenTracing C++ API"
DESCRIPTION = "C++ implementation of the OpenTracing API."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libopentracing-cpp1-1.6.0-1.9.aarch64.rpm"
RPM_HASH = "5170452fa63f21e9c394b1306503d033e6583eb6726def5cf2653fdebf626de198a16f8de7812f2a0533ec1eed16d639df80fe6358681c9aa84f30f42f404d68"

RPROVIDES:${PN} += "cmake(OpenTracing) \
libopentracing-cpp1 \
libopentracing-cpp1(aarch-64) \
libopentracing.so.1()(64bit) \
libopentracing_mocktracer.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

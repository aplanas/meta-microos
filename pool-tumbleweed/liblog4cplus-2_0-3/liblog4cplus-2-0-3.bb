SUMMARY = "C++ logging library"
DESCRIPTION = "log4cplus is a simple to use C++ logging API providing thread-safe, \
flexible, and arbitrarily granular control over log management and \
configuration. It is modeled after the Java log4j API."
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "liblog4cplus-2_0-3-2.0.8-1.4.aarch64.rpm"
RPM_HASH = "73b935f61fb7621b5c602f0cc03032139dd5d8a003706b224caa3290c361ce033a9cce9b8ffad20b4edcb1391c88a7879c28e739929080aa44834edd6d09a5a1"

RPROVIDES:${PN} += "liblog4cplus-2-0-3 \
liblog4cplus-2.0.so.3 \
liblog4cplusU-2.0.so.3 \
log4cplus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

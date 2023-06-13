SUMMARY = "Log4j like C++ Logging Library"
DESCRIPTION = "Log4cxx is a port to C++ of the log4j logging library."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "liblog4cxx13-0.13.0-1.3.aarch64.rpm"
RPM_HASH = "3df50e472e7ac12266d48a156da69e32be7efd9ffe66804fe4a5b7ccf224df3e4b79a604f3d7c99cb304a9459d281698521a59af11b8c7a5330d0e6bdc50870e"

RPROVIDES:${PN} += "liblog4cxx.so.13()(64bit) \
liblog4cxx13 \
liblog4cxx13(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libapr-1.so.0()(64bit) \
libaprutil-1.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libodbc.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

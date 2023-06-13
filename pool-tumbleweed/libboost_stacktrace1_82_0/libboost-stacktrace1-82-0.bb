SUMMARY = "Boost.Stacktrace runtime library"
DESCRIPTION = "This package contains the Boost.Stacktrace runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_stacktrace1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "c84ee3c470cd4a9adc5f621e760915fba730469d66057dd09359d58cf55577225901ccb3f548e841812e96efe0ed3fbea6c547078865e2ce3aca78d890de67c8"

RPROVIDES:${PN} += "libboost_stacktrace1_82_0 \
libboost_stacktrace1_82_0(aarch-64) \
libboost_stacktrace_addr2line.so.1.82.0()(64bit) \
libboost_stacktrace_basic.so.1.82.0()(64bit) \
libboost_stacktrace_noop.so.1.82.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

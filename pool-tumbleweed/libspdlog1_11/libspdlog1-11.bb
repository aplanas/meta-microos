SUMMARY = "C++ logging library"
DESCRIPTION = "A header-only/compiled, C++ logging library. \
 \
* Asynchronous mode (optional) \
* Multi/Single threaded loggers. \
* Various log targets (rotating/daily files, console, with colors, \
  syslog, custom target)"
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "libspdlog1_11-1.11.0-2.1.aarch64.rpm"
RPM_HASH = "477a002776f1ce62e4e04664bf2539fa959fa5cceb87fe9841168e4a45a3fe28c64966dc35595f84c7a1a7486e28edc94aebaa645009155cb6ce9a4e68057d33"

RPROVIDES:${PN} += "libspdlog.so.1.11()(64bit) \
libspdlog1_11 \
libspdlog1_11(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

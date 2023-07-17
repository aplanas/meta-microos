SUMMARY = "C++ logging library"
DESCRIPTION = "A header-only/compiled, C++ logging library. \
 \
* Asynchronous mode (optional) \
* Multi/Single threaded loggers. \
* Various log targets (rotating/daily files, console, with colors, \
  syslog, custom target)"
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libspdlog1_12-1.12.0-1.1.aarch64.rpm"
RPM_HASH = "aa43d758ff3c0fd85fbcad161debbeffd53381114f887015b7f31136eb5e436819a393d54bcce5da1d0c4bc272c5dc7d5a983e1190b4af51a4e5c72bf8e55225"

RPROVIDES:${PN} += "libspdlog.so.1.12 \
libspdlog1-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

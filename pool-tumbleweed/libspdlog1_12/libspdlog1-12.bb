SUMMARY = "C++ logging library"
DESCRIPTION = "A header-only/compiled, C++ logging library. \
 \
* Asynchronous mode (optional) \
* Multi/Single threaded loggers. \
* Various log targets (rotating/daily files, console, with colors, \
  syslog, custom target)"
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "libspdlog1_12-1.12.0-2.1.aarch64.rpm"
RPM_HASH = "a764d994f617f73375316da36c5ead711ceefb9ce6edd5c86ffa54b396c63e122ed6d735a476d10e792b2a47b9191d42d4717d5950f6b2e557debf25ebeed12c"

RPROVIDES:${PN} += "libspdlog.so.1.12 \
libspdlog1-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

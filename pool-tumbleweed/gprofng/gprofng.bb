SUMMARY = "The next generation profiling tool for Linux"
DESCRIPTION = "The next generation profiling tool for Linux"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "gprofng-2.40-5.1.aarch64.rpm"
RPM_HASH = "5ff0e75ee85c5762c57fd1f1f8b38aff057b527f1367497f92ea0950c0be8640b887f9cf9abc26baec2d9a2800184ea3fb36ad97046ab727b0992e975aeb839f"

RPROVIDES:${PN} += "gprofng \
gprofng(aarch-64) \
libgp-collector.so()(64bit) \
libgp-collectorAPI.so()(64bit) \
libgp-heap.so()(64bit) \
libgp-iotrace.so()(64bit) \
libgp-sync.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

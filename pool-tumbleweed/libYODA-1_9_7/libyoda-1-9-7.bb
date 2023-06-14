SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the source files for development with YODA."
LICENSE = "GPL-2.0-only"

PV = "1.9.7"

RPM_NAME = "libYODA-1_9_7-1.9.7-1.3.aarch64.rpm"
RPM_HASH = "61a2ef5c99800000c6ade69371c62f0cf0c9156c6c043deb71011c527903afd4b5aeb878bf22b4ed5088fa13c4fc67b27c7bbdcb0c8cc70ea8b3d2a1a81f65ec"

RPROVIDES:${PN} += "libYODA-1-9-7 \
libYODA-1.9.7.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

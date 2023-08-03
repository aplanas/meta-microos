SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the source files for development with YODA."
LICENSE = "GPL-2.0-only"

PV = "1.9.8"

RPM_NAME = "libYODA-1_9_8-1.9.8-1.1.aarch64.rpm"
RPM_HASH = "0955bdc7d83c5c164f7e93d7b94b3164fc4f6cd38b48575ada75611ed81fae077af207c5e9979da0d30fcf5109456c7f2f7d4e0421e28be6e8a245ccf13d996b"

RPROVIDES:${PN} += "libYODA-1-9-8 \
libYODA-1.9.8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

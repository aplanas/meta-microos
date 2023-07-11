SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the source files for development with YODA."
LICENSE = "GPL-2.0-only"

PV = "1.9.7"

RPM_NAME = "libYODA-1_9_7-1.9.7-1.4.aarch64.rpm"
RPM_HASH = "f4467a3a58f75812f5f49e5cb63a5603cee092b1672bf4acc6550ae1c4787a101018429ad8059d44afe6a104d237a551c68c4cda4c24a8d554be4ee2f70517a1"

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

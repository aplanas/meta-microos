SUMMARY = "PLplot functions for scientific plotting with C++"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's C++ binding."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplotcxx15-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "2c4fcca6ee60455a38cc062ad47ab36b24f6a5d96a5aae5e9584d0eec74f2fd8ac82e850fe8fdb3acca7a85d1e09e2885d993add0e5e53999e3e45f54e37b566"

RPROVIDES:${PN} += "libplplotcxx.so.15 \
libplplotcxx15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libplplot.so.17 \
libstdc++.so.6"

inherit rpm

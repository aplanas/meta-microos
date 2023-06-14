SUMMARY = "Shared libraries for ngspice"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the shared libraries."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "libngspice0-40-1.1.aarch64.rpm"
RPM_HASH = "e0cccb4e041b9941640488c711a5e2425cc92c9df1962c37fff4a644534974e0914acd3381043aeeeea2a0d841653e2f2da8b273447f31a286b5c7ef9b24abe4"

RPROVIDES:${PN} += "libngspice.so.0 \
libngspice0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtinfo.so.6 \
ngspice-scripts \
ngspice-xspice-cm"

inherit rpm

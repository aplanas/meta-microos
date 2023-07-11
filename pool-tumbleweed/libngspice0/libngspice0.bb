SUMMARY = "Shared libraries for ngspice"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the shared libraries."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "libngspice0-40-1.2.aarch64.rpm"
RPM_HASH = "19b3a225b42b7f20d22455eadf263387333d6cd7b9f2cee4f5b579e198f8f19fbcc6a75fddc6da47e164081be550380fa90a197c4e5fa10338851233615460cf"

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

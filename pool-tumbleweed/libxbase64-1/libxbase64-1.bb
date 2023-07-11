SUMMARY = "XBase Compatible C++ Class Library"
DESCRIPTION = "This is an XBase (dBase and FoxPro, for example) compatible C++ class \
library."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "libxbase64-1-3.1.2-1.24.aarch64.rpm"
RPM_HASH = "0e01a2564128d3377d3839d002df82e3d09be2ce9cc3bb15874fa59b9f34f30d777e1dfd9a073980977023f64f705900b706864901b8593eb0c83e67491e5df0"

RPROVIDES:${PN} += "libxbase64-1 \
libxbase64.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit) server functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjackserver0-1.9.22-2.2.aarch64.rpm"
RPM_HASH = "033da530a1d319ab9d53360f9d5ec7d4d7525adbe054737b1592ea365b78c906b66b76013f0731262fbd032e13c1020b8235e6601dfa04e5bad8aa1d9675f122"

RPROVIDES:${PN} += "libjack0-/usr/lib64/libjackserver.so.0* \
libjackserver.so.0 \
libjackserver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcelt0.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libopus.so.0 \
libstdc++.so.6"

inherit rpm

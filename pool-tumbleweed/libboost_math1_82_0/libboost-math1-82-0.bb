SUMMARY = "Boost.Math runtime libraries"
DESCRIPTION = "This package contains the Boost.Math Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_math1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "9d011204c8e48e32109620c032fcdcc6369f8485870d7d4645548833a70d3d2649f0c4da5ca2fb7adf5e4aa091a7da9f550baeb8d1e481139085d10aa2f9e31d"

RPROVIDES:${PN} += "libboost-math-c99.so.1.82.0 \
libboost-math-c99f.so.1.82.0 \
libboost-math-c99l.so.1.82.0 \
libboost-math-tr1.so.1.82.0 \
libboost-math-tr1f.so.1.82.0 \
libboost-math-tr1l.so.1.82.0 \
libboost-math1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

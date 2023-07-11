SUMMARY = "Celestial Mechanics, Astrometry and Astrodynamics Library"
DESCRIPTION = "libnova is a general purpose, double precision, Celestial Mechanics, \
Astrometry and Astrodynamics library. The intended audience of libnova \
is C & C++ programmers, astronomers and anyone else interested in \
calculating positions of astronomical objects or celestial mechanics."
LICENSE = "LGPL-2.0+"

PV = "0.15.0"

RPM_NAME = "libnova-0_15-0-0.15.0-10.30.aarch64.rpm"
RPM_HASH = "bf0ba1684a324fc6c6a2298e7c507649ee4060d0cb545d15b68f956e3615d49eaef7bf1c163d5db2bf5aba2e3a2e2d7438633b74d35293cfa2f6cc932b58dc79"

RPROVIDES:${PN} += "libnova-0-15-0 \
libnova-0.15.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

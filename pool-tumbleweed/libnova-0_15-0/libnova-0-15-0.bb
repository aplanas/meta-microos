SUMMARY = "Celestial Mechanics, Astrometry and Astrodynamics Library"
DESCRIPTION = "libnova is a general purpose, double precision, Celestial Mechanics, \
Astrometry and Astrodynamics library. The intended audience of libnova \
is C & C++ programmers, astronomers and anyone else interested in \
calculating positions of astronomical objects or celestial mechanics."
LICENSE = "LGPL-2.0+"

PV = "0.15.0"

RPM_NAME = "libnova-0_15-0-0.15.0-10.29.aarch64.rpm"
RPM_HASH = "581f4242b0a00116f53c160765a558cc2a947dcfed8a7f63ae9b483ddb9506157a7128fc5a9734426a0be42b68a4d941157335bb387590e665ad1c301c123a3b"

RPROVIDES:${PN} += "libnova-0-15-0 \
libnova-0.15.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

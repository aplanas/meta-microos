SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-devel-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "1130d2168466e1947cc8c7463eaf8eb7a3205459f9a731410c5cde4ebeca7756c204470ac3f2fac1d77243a8625482a473755751774dc3499abde27bbfa5e848"

RPROVIDES:${PN} += "gcc13-devel"

RDEPENDS:${PN} += "gcc13 \
gmp-devel \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
mpc-devel"

inherit rpm

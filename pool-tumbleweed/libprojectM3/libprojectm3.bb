SUMMARY = "Run-time library for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "libprojectM3-3.1.12-1.12.aarch64.rpm"
RPM_HASH = "98b2d4fb91c55745939dfe41e7ae0d44f9cd478793a9a37ae7fd23261dda75c9dcf0d7c84d695b9525b8c4c91260f5e47825838b28b13634a32cd81473e8fd0c"

RPROVIDES:${PN} += "libprojectM-qt5-3 \
libprojectM.so.3 \
libprojectM3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

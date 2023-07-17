SUMMARY = "3D printer control software"
DESCRIPTION = "Communication library between internal components for Ultimaker software"
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libArcus3-4.13.1-4.2.aarch64.rpm"
RPM_HASH = "2c1e80f802231a548928d8f51b911d972bc90d8eab814d4aab8f08233ee94caaa726cf3e21bc149e3d0f28a645d03f48fa6c179dc728facd9542b61c1948080e"

RPROVIDES:${PN} += "libArcus-Ultimaker \
libArcus.so.3 \
libArcus3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.23.4.0 \
libstdc++.so.6"

inherit rpm

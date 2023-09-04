SUMMARY = "Threading Building Blocks (TBB) NUMA support library"
DESCRIPTION = "The NUMA support library for Threading Building Blocks (TBB)"
LICENSE = "Apache-2.0"

PV = "2021.10.0"

RPM_NAME = "libtbbbind_2_5-3-2021.10.0-1.1.aarch64.rpm"
RPM_HASH = "e2456821021443e2d03f5a3273167cefd75e0866bd61b144e5ffbc5511c1b9b217d07e698fecbf2b5592007f897cb3763de93b9db3681de278d0baf574c3d7a8"

RPROVIDES:${PN} += "libtbbbind-2-5-3 \
libtbbbind-2-5.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhwloc.so.15 \
libstdc++.so.6"

inherit rpm

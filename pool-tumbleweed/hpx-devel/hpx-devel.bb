SUMMARY = "Development headers and libraries for hpx"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale. \
 \
This package contains development headers and libraries for hpx"
LICENSE = "BSL-1.0"

PV = "1.8.1"

RPM_NAME = "hpx-devel-1.8.1-2.4.aarch64.rpm"
RPM_HASH = "294d14bea2dde6b2746c90812f4ccfca72610238eba2958583a283c8f2c054d76bcc41666839815b978f2490b2949e468e7a50ade09836ce043102866beac7f0"

RPROVIDES:${PN} += "cmake-HPX \
hpx-devel \
libhpx-core.so \
pkgconfig-hpx-application-relwithdebinfo \
pkgconfig-hpx-component-relwithdebinfo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libatomic.so.1 \
libboost-context.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libhpx1 \
libhwloc.so.15 \
libm.so.6 \
libstdc++.so.6 \
libtcmalloc-minimal.so.4 \
openmpi4-devel"

inherit rpm

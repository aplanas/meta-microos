SUMMARY = "Parallel ray tracing system"
DESCRIPTION = "A parallel ray tracing system supporting MPI and multithreaded \
implementations. \
 \
Tachyon implements the basic geometric primitives such as triangles, \
planes, spheres, cylinders, etc. Tachyon parallelizes unlike POV-Ray \
and Rayshade."
LICENSE = "BSD-3-Clause"

PV = "0.99.5"

RPM_NAME = "tachyon-0.99.5-1.4.aarch64.rpm"
RPM_HASH = "58f9361f31933ed17625244d21ba6fae2302abcb9ee85b7e93dab46fd5876ec38eb90f65bbfb1e3ff8db195b1a87a72b1325e00e9afb8a4c27ca3f203f8fa062"

RPROVIDES:${PN} += "tachyon \
tachyon(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libtachyon-0.99.5.so()(64bit)"

inherit rpm

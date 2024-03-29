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

RPROVIDES:${PN} += "tachyon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libtachyon-0.99.5.so"

inherit rpm

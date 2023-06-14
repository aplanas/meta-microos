SUMMARY = "Core library for the Tachyon Parallel Ray Tracing System"
DESCRIPTION = "A parallel ray tracing system supporting MPI and multithreaded \
implementations. \
 \
Tachyon implements the basic geometric primitives such as triangles, \
planes, spheres, cylinders, etc. Tachyon parallelizes unlike POV-Ray \
and Rayshade."
LICENSE = "BSD-3-Clause"

PV = "0.99.5"

RPM_NAME = "libtachyon-0_99_5-0.99.5-1.4.aarch64.rpm"
RPM_HASH = "4c7f0d246c2130101a4dce7477948bf9e0dba4d745825e83cf58d274a77d4c047381e1a1a20563dd37aeece871133562c2ab7abb2501268420f11d4dc840f113"

RPROVIDES:${PN} += "libtachyon-0-99-5 \
libtachyon-0.99.5.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16"

inherit rpm

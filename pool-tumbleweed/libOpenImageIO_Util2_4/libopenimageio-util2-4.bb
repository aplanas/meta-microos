SUMMARY = "Library for Reading and Writing Images"
DESCRIPTION = "OpenImageIO is a library for reading and writing images, and a bunch of related \
classes, utilities, and applications. There is a particular emphasis on formats \
and functionality used in professional, large-scale animation and visual \
effects work for film. OpenImageIO is used extensively in animation and VFX \
studios all over the world, and is also incorporated into several commercial \
products."
LICENSE = "BSD-3-Clause"

PV = "2.4.13.0"

RPM_NAME = "libOpenImageIO_Util2_4-2.4.13.0-1.1.aarch64.rpm"
RPM_HASH = "15746eabae6aceaa855992a2c0760794632b15238a1d80cd8f5371ea2825a8348c0d57b6d6715780a0aa4c78b9508ff0f38094e15c7721ebacf00a6ef371249c"

RPROVIDES:${PN} += "libOpenImageIO-Util.so.2.4 \
libOpenImageIO-Util2-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm

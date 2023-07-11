SUMMARY = "Library for Reading and Writing Images"
DESCRIPTION = "OpenImageIO is a library for reading and writing images, and a bunch of related \
classes, utilities, and applications. There is a particular emphasis on formats \
and functionality used in professional, large-scale animation and visual \
effects work for film. OpenImageIO is used extensively in animation and VFX \
studios all over the world, and is also incorporated into several commercial \
products."
LICENSE = "BSD-3-Clause"

PV = "2.4.12.0"

RPM_NAME = "OpenImageIO-2.4.12.0-1.2.aarch64.rpm"
RPM_HASH = "a4eb7d9e0791f054ca0f4898cb9d78a10277ee37f5cb8457dd88296675dabdb7bbb1e6394f68df5118861b634bb9ea37c86c0c210d7acf516b2bdf63842a28b2"

RPROVIDES:${PN} += "OpenImageIO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIlmThread-3-1.so.30 \
libImath-3-1.so.29 \
libOpenEXR-3-1.so.30 \
libOpenImageIO-Util.so.2.4 \
libOpenImageIO.so.2.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

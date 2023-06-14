SUMMARY = "Library for Reading and Writing Images"
DESCRIPTION = "OpenImageIO is a library for reading and writing images, and a bunch of related \
classes, utilities, and applications. There is a particular emphasis on formats \
and functionality used in professional, large-scale animation and visual \
effects work for film. OpenImageIO is used extensively in animation and VFX \
studios all over the world, and is also incorporated into several commercial \
products."
LICENSE = "BSD-3-Clause"

PV = "2.4.12.0"

RPM_NAME = "OpenImageIO-2.4.12.0-1.1.aarch64.rpm"
RPM_HASH = "63dc5db5ea171058d1757cbd6d3f41cedcacc27357b4d940752697979d53a51eceeff4fe2254feb76aba61fba51b9d91d631880e1c7037594988534c35178c7f"

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

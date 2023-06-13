SUMMARY = "Library for Reading and Writing Images"
DESCRIPTION = "OpenImageIO is a library for reading and writing images, and a bunch of related \
classes, utilities, and applications. There is a particular emphasis on formats \
and functionality used in professional, large-scale animation and visual \
effects work for film. OpenImageIO is used extensively in animation and VFX \
studios all over the world, and is also incorporated into several commercial \
products."
LICENSE = "BSD-3-Clause"

PV = "2.4.12.0"

RPM_NAME = "libOpenImageIO_Util2_4-2.4.12.0-1.1.aarch64.rpm"
RPM_HASH = "873544537d39b0dee723eb259ba8104958a77db2d2f6f1e6e66d923a5d2f298a7c0aba6c1d58cb1b1adb2f440e38e53d5596c5324152d6723157be3dbcdc82b7"

RPROVIDES:${PN} += "libOpenImageIO_Util.so.2.4()(64bit) \
libOpenImageIO_Util2_4 \
libOpenImageIO_Util2_4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libImath-3_1.so.29()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtbb.so.12()(64bit)"

inherit rpm

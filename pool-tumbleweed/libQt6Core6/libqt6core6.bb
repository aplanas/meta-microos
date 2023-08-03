SUMMARY = "Qt 6 Core library"
DESCRIPTION = "The Qt 6 Core library. It adds these features to C++: \
 \
* a mechanism for object communication called signals and slots \
* queryable and designable object properties \
* hierarchical and queryable object trees that organize \
* object ownership in a natural way with guarded pointers (QPointer) \
* a dynamic cast that works across library boundaries"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Core6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c33fcc425f8f3a96c1b8017e7db32e76e934c727557e782fc47003343e4da1a631d421a98a3d577d51ca8c80b7a6d7fd139677fc30b80bbc1cb0b7accdb30582"

RPROVIDES:${PN} += "libQt6Core.so.6 \
libQt6Core6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libb2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libpcre2-16.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm

SUMMARY = "Qt 6 Core library"
DESCRIPTION = "The Qt 6 Core library. It adds these features to C++: \
 \
* a mechanism for object communication called signals and slots \
* queryable and designable object properties \
* hierarchical and queryable object trees that organize \
* object ownership in a natural way with guarded pointers (QPointer) \
* a dynamic cast that works across library boundaries"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Core6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0ebc983840d79f3472cf6f2183e43bfb4502e02dc911c3e39431af00df95d7dbbf91039f2bdb1a3beb1fb73b5f1fa9967a2049c19ba75fcd17403622f57a67d4"

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

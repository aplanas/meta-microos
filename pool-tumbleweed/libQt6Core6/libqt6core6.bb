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

RPROVIDES:${PN} += "libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core6 \
libQt6Core6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libb2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libdouble-conversion.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libpcre2-16.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm

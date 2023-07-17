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

RPM_NAME = "libQt6Core6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "431f2f950f674f496be91a1275a5f6dc2382c46cd0218adc323440ad5230f7a824c621bda13604e74bfc44464c8cd9f84fadcceef919ae98deaadc139a217117"

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

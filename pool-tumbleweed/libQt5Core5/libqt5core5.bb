SUMMARY = "Qt 5 Core Library"
DESCRIPTION = "The Qt 5 Core library. It adds these features to C++: \
 \
* a mechanism for object communication called signals and slots \
* queryable and designable object properties \
* hierarchical and queryable object trees that organize \
* object ownership in a natural way with guarded pointers (QPointer) \
* a dynamic cast that works across library boundaries"
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Core5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "24d9e57a09f4616d7cd2eb55eb30f71dde55aa625be2b5220d14698902383eaee99feddff55229d8990160ad92b733acc4901c4074e6d948aab7639865ba9970"

RPROVIDES:${PN} += "libQt5Core.so.5 \
libQt5Core5 \
libqt5-qtbase"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
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

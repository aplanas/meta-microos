SUMMARY = "Qt5 UI backend for the gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication). \
 \
This package provides the Qt5 implementation of the generic UI toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwengui-qt5-79-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "3816447dcf79cd230dc3bfabaa243de87e5b5172f089f651ed37811c89e521815977d0a0d357a13ac4788e818daab4a4bfa8fa85282a16fdc5d7ea8a70b89bd8"

RPROVIDES:${PN} += "libgwengui-qt4-0 \
libgwengui-qt5-79 \
libgwengui-qt5.so.79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgwengui-cpp.so.79 \
libgwenhywfar.so.79 \
libstdc++.so.6"

inherit rpm

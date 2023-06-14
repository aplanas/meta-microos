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

RPM_NAME = "libgwengui-qt5-79-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "0aaec0402133eccbcb8e3db279165c117628f91480ea732677ebf92e428946dff236b04b03446f2b4b446b0ed909798332a3e4aebd516baafd462ddb713d3e38"

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

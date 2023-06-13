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
libgwengui-qt5-79(aarch-64) \
libgwengui-qt5.so.79()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgwengui-cpp.so.79()(64bit) \
libgwenhywfar.so.79()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm

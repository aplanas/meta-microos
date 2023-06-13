SUMMARY = "GTK+ 3 UI backend for Gwenhywfar"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication). \
 \
This package provides the GTK+ 3 implementation of the generic UI toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwengui-gtk3-79-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "4735ef49218a9f4927978a0125a03bd9416b32440a330e4c774b3e043f402af0357bb323df47c1fdda7d49423715fedf6be6e5ede930829f6450dcd5af26038a"

RPROVIDES:${PN} += "libgwengui-gtk3-79 \
libgwengui-gtk3-79(aarch-64) \
libgwengui-gtk3.so.79()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgwenhywfar.so.79()(64bit)"

inherit rpm

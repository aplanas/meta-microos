SUMMARY = "GTK+ 2 UI backend for Gwenhywfar"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication). \
 \
This package provides the GTK+ 2 implementation of the generic UI toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwengui-gtk2-79-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "76bf254a5c3a3eca04ba63a5d7e6a5e286b333fc0ac2c217e5a3e05dc285d790f53dae85f6e7f87279c9abd26211084a5c84bd309fee81956bf5798c2ac5ea06"

RPROVIDES:${PN} += "libgwengui-gtk2-79 \
libgwengui-gtk2.so.79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libgwenhywfar.so.79"

inherit rpm

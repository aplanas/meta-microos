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

RPM_NAME = "libgwengui-gtk3-79-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "e24501ec43679bcff2bf46e31af134e8ac11d6720e18359962415c383d1ea0dd1719d56e1f7e3de634f39a04fbc27a8196c6df8dd39ffbf6e07b1954e0c97243"

RPROVIDES:${PN} += "libgwengui-gtk3-79 \
libgwengui-gtk3.so.79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgwenhywfar.so.79"

inherit rpm

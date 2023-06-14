SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "libgpaste-gtk-3-0-43.2+6-2.1.aarch64.rpm"
RPM_HASH = "1291b8c0056bec5f2e9db547e6ee8bba0d08b9fc997e71f3a0e383f01b2e8ea5e6293cb8a3f748978d670bd86d5466e393b0c3729023d3fea9130d66c88f13df"

RPROVIDES:${PN} += "libgpaste-gtk-3-0 \
libgpaste-gtk-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpaste-2.so.0 \
libgtk-3.so.0"

inherit rpm

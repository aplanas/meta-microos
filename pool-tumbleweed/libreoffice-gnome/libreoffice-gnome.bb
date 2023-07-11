SUMMARY = "GNOME Extensions for LibreOffice"
DESCRIPTION = "This package contains some GNOME extensions and GTK2 interface for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-gnome-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "dfe4f75195c9812a16f51c6fe11cbb1a386ab5306df4bb91bebb433fc00ec862ed5719ba00f6c652a2c1b7aac9df396156ef98ed2daa7b4f9a494fc1596fd17e"

RPROVIDES:${PN} += "libevoablo.so \
liblosessioninstalllo.so \
libreoffice-gnome \
libucpgio1lo.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfilelo.so \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libi18nlangtag.so \
libm.so.6 \
libmergedlo.so \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
rtld-GNU-HASH"

inherit rpm

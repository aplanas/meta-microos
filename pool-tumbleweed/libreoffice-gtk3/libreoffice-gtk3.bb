SUMMARY = "Gtk3 interface for LibreOffice"
DESCRIPTION = "This package contains Gtk3 interface rendering option for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-gtk3-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "29ed305149cfb8c70f9ca5e4a2c94eb68ee912cc2a534cb144d43ca6e4e8863858afc887b1d0346b9077be062153e9882d0e7b97a2c853e4a1c7be5f0773a650"

RPROVIDES:${PN} += "libreoffice-gtk3 \
libvclplug-gtk3lo.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libi18nlangtag.so \
libjvmaccesslo.so \
libm.so.6 \
libmergedlo.so \
libpango-1.0.so.0 \
libreoffice-gnome \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
rtld-GNU-HASH"

inherit rpm

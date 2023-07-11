SUMMARY = "Gtk3 interface for LibreOffice"
DESCRIPTION = "This package contains Gtk3 interface rendering option for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-gtk3-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "59417fdbfc358ddc9c84efad0f02f3b04d4c859fd8bd7cc99e8eccc76a1ff9030fc328af5d8bbcbd635e6d75149d5b6f71dfa0dd9d41784a313647a6aff2cbe5"

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

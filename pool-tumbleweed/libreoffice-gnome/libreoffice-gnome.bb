SUMMARY = "GNOME Extensions for LibreOffice"
DESCRIPTION = "This package contains some GNOME extensions and GTK2 interface for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-gnome-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "4e1cdfee57dc0bdce257846f9b9a551021c19fd7efa97928e20424686979148a89f144e7b04243855cb794b7c0b1e06a5946d3fbbdabb5f99a70a59724243070"

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

SUMMARY = "GNOME Extensions for LibreOffice"
DESCRIPTION = "This package contains some GNOME extensions and GTK2 interface for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-gnome-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "18fe1a8294cdf1a5e5dba1c23d286320cf4b76b621316db204c265ef54b017722c6b25e52f77ab5a461100d40fc31ea5d8cafd0cd5ea9bdaecc61b92151fa141"

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

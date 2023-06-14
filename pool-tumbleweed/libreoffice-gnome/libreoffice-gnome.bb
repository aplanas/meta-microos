SUMMARY = "GNOME Extensions for LibreOffice"
DESCRIPTION = "This package contains some GNOME extensions and GTK2 interface for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-gnome-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "61a44633883145d3700a0479fa6fa39f1f717e3329e1cc90d4f3e0b6db212b1a79ad53f51d8e926258aa3bdabc08a553d9b54e5be98fa744187e9e98ea727e38"

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

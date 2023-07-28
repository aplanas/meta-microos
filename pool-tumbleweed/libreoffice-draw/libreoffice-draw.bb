SUMMARY = "LibreOffice Draw"
DESCRIPTION = "This module allows you to create and edit drawings, flow charts, and \
logos by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-draw-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "f3ac43ce724c7457394a9711832e87a4c4ec24411aedc9fddbfb9200f0cadd53de2dea752388bba41d65e993813694f5efe37089e17a99f7b84a6f48316e7dc9"

RPROVIDES:${PN} += "libpdfimportlo.so \
libreoffice-draw"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmergedlo.so \
libpoppler.so.130 \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libz.so.1 \
rtld-GNU-HASH"

inherit rpm

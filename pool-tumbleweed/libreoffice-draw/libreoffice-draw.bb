SUMMARY = "LibreOffice Draw"
DESCRIPTION = "This module allows you to create and edit drawings, flow charts, and \
logos by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-draw-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "868859b5e0ec066ddba5747020147cf7a512549422f64050482944c1d40fee5f540c74b38dac39ffb8f520434a94ce6869055b24edaa4dc6a4896adff790ced7"

RPROVIDES:${PN} += "libpdfimportlo.so \
libreoffice-draw"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmergedlo.so \
libpoppler.so.128 \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libz.so.1 \
rtld-GNU-HASH"

inherit rpm

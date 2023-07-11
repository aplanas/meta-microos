SUMMARY = "LibreOffice Draw"
DESCRIPTION = "This module allows you to create and edit drawings, flow charts, and \
logos by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-draw-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "5515e0f1ae322dd561886261a77c9ae2baa2e1f9d356eae6a99ef4f65610e40e6b21cf41e06f0bdc7a047aef9f88a0242c2249bf797703d4e8bb5fa7c171d43e"

RPROVIDES:${PN} += "libpdfimportlo.so \
libreoffice-draw"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmergedlo.so \
libpoppler.so.129 \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libz.so.1 \
rtld-GNU-HASH"

inherit rpm

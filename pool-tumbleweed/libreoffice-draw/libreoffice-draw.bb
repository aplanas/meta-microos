SUMMARY = "LibreOffice Draw"
DESCRIPTION = "This module allows you to create and edit drawings, flow charts, and \
logos by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-draw-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "0ae80f2ade056773e7167a888fb01bfee32e4c125037ea81a255393f44ced0cd050617ab823704af8502a749f56d8025c0de0859b95627a84fbc53d8df587afd"

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

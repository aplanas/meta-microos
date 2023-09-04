SUMMARY = "LibreOffice Math"
DESCRIPTION = "This module allows you to create and edit scientific formulas and \
equations by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-math-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "592c915f0662a0d4a8b58f71f68d99090152e630d1509c65dc1d50638970615f3a1e66c9d212f6243e8c6f696cd802a097a6fa5dc9265330c2801891e7b2fd02"

RPROVIDES:${PN} += "libreoffice-math \
libsmdlo.so \
libsmlo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libi18nlangtag.so \
libm.so.6 \
libmergedlo.so \
libooxlo.so \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
rtld-GNU-HASH"

inherit rpm

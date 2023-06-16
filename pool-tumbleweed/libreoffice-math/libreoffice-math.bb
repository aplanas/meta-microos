SUMMARY = "LibreOffice Math"
DESCRIPTION = "This module allows you to create and edit scientific formulas and \
equations by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-math-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "e728a29dab303d9713c24c2ed54c3e758ff5764acc71b4dc9bc3c03b8b4e88fe1b8c4514c602239b7f0d01893cacc51578e17d8a813c07b0ae85c13e89e0cd9c"

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

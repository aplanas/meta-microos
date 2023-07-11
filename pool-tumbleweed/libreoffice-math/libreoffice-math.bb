SUMMARY = "LibreOffice Math"
DESCRIPTION = "This module allows you to create and edit scientific formulas and \
equations by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-math-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "9bd28de2f5f1df2abb0eb9cb605b51180ab695b8d7561fb80c1bba186e9ce626b04fb1ef8b01e408c6658d63a46a280fae3150e8192f125c5b07b2be9ade5a2d"

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

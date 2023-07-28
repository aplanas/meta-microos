SUMMARY = "LibreOffice Math"
DESCRIPTION = "This module allows you to create and edit scientific formulas and \
equations by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-math-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "5bbe55c83e1e9dc73a96e9f82e928a081fa785d7661dacdbdda78c7eab9d4baab9869e7330b85e15d08457205afef89de125ed119bca3af4ea93e143ab502229"

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

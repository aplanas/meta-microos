SUMMARY = "LibreOffice Base"
DESCRIPTION = "This module allows you to manage databases, create queries and reports \
to track and manage your information by using LibreOffice office \
suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-base-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "44ed1a34eee0b6fdcd7ce76c2ea84a6b836e04811c63fbeb82a8a069de8b9ee7c70514a584f0c0fae249af2f9b7641f3eb8fb6e7a34e1706cc9bcce4119a63b7"

RPROVIDES:${PN} += "libabplo.so \
libdbplo.so \
libdbulo.so \
libmysqlclo.so \
libreoffice-base \
librptlo.so \
librptuilo.so \
librptxmllo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
jre-64 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbalo.so \
libgcc-s.so.1 \
libi18nlangtag.so \
libm.so.6 \
libmariadb.so.3 \
libmergedlo.so \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
pentaho-reporting-flow-engine \
rtld-GNU-HASH"

inherit rpm

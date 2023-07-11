SUMMARY = "LibreOffice Base"
DESCRIPTION = "This module allows you to manage databases, create queries and reports \
to track and manage your information by using LibreOffice office \
suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-base-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "ff45431df073a5ba9b4e3b46a1b8f39025f7416c924b029adb62670b0f5f4bdd7d66d3aacf642921d0cdd8a419d656aad96e288dd6fb0ae73ddbf8ec5d18f41b"

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

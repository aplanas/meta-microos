SUMMARY = "LibreOffice Base"
DESCRIPTION = "This module allows you to manage databases, create queries and reports \
to track and manage your information by using LibreOffice office \
suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-base-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "1354bbc057532611fae3d21d0d7dcbb1536a5e57f07164f96b5049a58077fde881ce0a280d8d697970b88d2c346abd7a6eb9ebdea9e9ff9ce2affee9af0d08b9"

RPROVIDES:${PN} += "libabplo.so \
libdbplo.so \
libdbulo.so \
libmysqlclo.so \
libreoffice-base \
librptlo.so \
librptuilo.so \
librptxmllo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
jre \
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

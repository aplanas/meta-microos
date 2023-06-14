SUMMARY = "LibreOffice Base"
DESCRIPTION = "This module allows you to manage databases, create queries and reports \
to track and manage your information by using LibreOffice office \
suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-base-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "1d748b2334b27b6cbfe5eb8ed07a4e5fae0ab40a0656074ea51d2e3ea1c952765437bfe8626959429e003012bdd6b3d725fa3fddbe969becd0324d508ff27139"

RPROVIDES:${PN} += "libabplo.so \
libdbplo.so \
libdbulo.so \
libmysqlclo.so \
libreoffice-base \
librptlo.so \
librptuilo.so \
librptxmllo.so"

RDEPENDS:${PN} += "/bin/sh \
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

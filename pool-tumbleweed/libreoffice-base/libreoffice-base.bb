SUMMARY = "LibreOffice Base"
DESCRIPTION = "This module allows you to manage databases, create queries and reports \
to track and manage your information by using LibreOffice office \
suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-base-7.6.1.1-1.1.aarch64.rpm"
RPM_HASH = "79980820bdc89223fb5bec85f6f26665c852d8e597a5c26223a23525c50075a5712dbcef16b7a29ee272bd180dd0d81793eb21212f56e339712f139db01d33bc"

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

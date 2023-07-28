SUMMARY = "PostgreSQL Database Driver for LibreOffice"
DESCRIPTION = "This package allows to access PostgreSQL databases from LibreOffice Base."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-base-drivers-postgresql-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "8f074d2f0ff0b9d3fe4c93972b7c35831055a69b9b62d1f6e8e8596b478008e1673cee3f492ec3fd8f9c9fefc9cdde98a3fa74b37fef830662729c53cbf2ef49"

RPROVIDES:${PN} += "libpostgresql-sdbc-impllo.so \
libpostgresql-sdbclo.so \
libreoffice-base-drivers-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmergedlo.so \
libpq.so.5 \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
postgresql \
rtld-GNU-HASH"

inherit rpm

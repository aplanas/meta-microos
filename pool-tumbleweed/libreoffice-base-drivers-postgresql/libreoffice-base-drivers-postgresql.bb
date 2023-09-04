SUMMARY = "PostgreSQL Database Driver for LibreOffice"
DESCRIPTION = "This package allows to access PostgreSQL databases from LibreOffice Base."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-base-drivers-postgresql-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "355b6324dd3c3ef108d2210f25eafde96f1344bf9216fe867dfac7e18d9620bd38823a6c44cf976ba6294435a16c07e2454c0ac8e10220e3bfd6b0ac2741f021"

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

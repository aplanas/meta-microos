SUMMARY = "PostgreSQL Database Driver for LibreOffice"
DESCRIPTION = "This package allows to access PostgreSQL databases from LibreOffice Base."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-base-drivers-postgresql-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "5f6792cdeca2edd23f649c56f8b6b6978bd0b9fe62bc3e8a182606a31c65ea38a4b2c3325ebe1d36ca21ad130de3e3ae0418a5bebfd6daaad428cc4e47172d52"

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

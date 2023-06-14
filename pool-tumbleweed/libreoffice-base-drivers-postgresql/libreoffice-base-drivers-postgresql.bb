SUMMARY = "PostgreSQL Database Driver for LibreOffice"
DESCRIPTION = "This package allows to access PostgreSQL databases from LibreOffice Base."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-base-drivers-postgresql-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "fbc29f6f36ba27fd7a0f97544633cf7f9ec24459e8edffface03fcffe90c41684271b384e4f4e7eee4bd1d202b176ad8333cd4d83def6b5b1fee2a1f8967be2c"

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

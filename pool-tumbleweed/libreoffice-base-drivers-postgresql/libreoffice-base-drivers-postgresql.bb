SUMMARY = "PostgreSQL Database Driver for LibreOffice"
DESCRIPTION = "This package allows to access PostgreSQL databases from LibreOffice Base."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-base-drivers-postgresql-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "fbc29f6f36ba27fd7a0f97544633cf7f9ec24459e8edffface03fcffe90c41684271b384e4f4e7eee4bd1d202b176ad8333cd4d83def6b5b1fee2a1f8967be2c"

RPROVIDES:${PN} += "libpostgresql-sdbc-impllo.so()(64bit) \
libpostgresql-sdbclo.so()(64bit) \
libreoffice-base-drivers-postgresql \
libreoffice-base-drivers-postgresql(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmergedlo.so()(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libuno_cppu.so.3()(64bit) \
libuno_cppu.so.3(UDK_3_0_0)(64bit) \
libuno_cppuhelpergcc3.so.3()(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
libuno_salhelpergcc3.so.3()(64bit) \
libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) \
postgresql \
rtld(GNU_HASH)"

inherit rpm

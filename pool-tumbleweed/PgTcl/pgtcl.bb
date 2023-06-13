SUMMARY = "Tcl Client Library for PostgreSQL"
DESCRIPTION = "This package contains the libpgtcl client library as a loadable Tcl \
package. It is needed to access PostgreSQL databases from Tcl scripts."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "PgTcl-1.7-12.15.aarch64.rpm"
RPM_HASH = "8791ca2acf1604baa57c040066a1c4e33af859d9f02e9903de82b739cb621f524ccc3bcce1c2fbcd4e51d255944bad8161139208df71d544d2c4353ef6b7af2a"

RPROVIDES:${PN} += "PgTcl \
PgTcl(aarch-64) \
libpgtcl1.7.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit)"

inherit rpm

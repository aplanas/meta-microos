SUMMARY = "Pager for PostgreSQL, MariaDB, Percona, and MySQL"
DESCRIPTION = "Advanced pager for PostgreSQL and MySQL databases. \
Everybody who uses psql uses less pager. It is working well, but there is \
not any special support for tabular data. Tabular data related features \
are core functionality of this pager."
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "pspg-1.9.0-1.16.aarch64.rpm"
RPM_HASH = "417a73a82a73e1455ad3b8749ca2601348bcd737d52c3c2cfd83de4614e674d477ff1b3f382b6501109bbb070abb87ba0d4928ccb1960f213274c13ade8115bf"

RPROVIDES:${PN} += "pspg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm

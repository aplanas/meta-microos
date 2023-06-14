SUMMARY = "Pager for PostgreSQL, MariaDB, Percona, and MySQL"
DESCRIPTION = "Advanced pager for PostgreSQL and MySQL databases. \
Everybody who uses psql uses less pager. It is working well, but there is \
not any special support for tabular data. Tabular data related features \
are core functionality of this pager."
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "pspg-1.9.0-1.15.aarch64.rpm"
RPM_HASH = "7372b58aac7e3bae5443c6589024b224e2a0506ccbbc59bf6c940dd95c3068ebe66df976fa797ece63dc60e1a460280865d66f07e127f91c53a77bac867061fd"

RPROVIDES:${PN} += "pspg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm

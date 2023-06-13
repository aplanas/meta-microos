SUMMARY = "Plugin to use prelude with a pgsql database"
DESCRIPTION = "This plugin allows prelude to store alerts into a pgsql database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-pgsql-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "f6f7dc5e1772ef585d655bc9b4ff914563d568ddf67b74903fb6bdbf30e47af1cf6c588cbee6d3714231dcc1066381281611cee3afa0259de9a1f716b200ebdb"

RPROVIDES:${PN} += "libpreludedb-pgsql \
libpreludedb-pgsql(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit) \
libprelude.so.28()(64bit) \
libpreludedb-plugins \
libpreludedb.so.7()(64bit) \
postgresql-server"

inherit rpm

SUMMARY = "Plugin to use prelude with a mysql database"
DESCRIPTION = "This plugin allows prelude to store alerts into a mysql database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-mysql-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "b29e714cca83e5755ef26ba53a727cf345a3f07ebc57b46f8416808ff56ffce99707c843ff151f0df4dd358ebedcf2413ddce85c6cd4933014bc8374be43f2c6"

RPROVIDES:${PN} += "libpreludedb-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libprelude.so.28 \
libpreludedb-plugins \
libpreludedb.so.7 \
mysql \
mysql-server"

inherit rpm

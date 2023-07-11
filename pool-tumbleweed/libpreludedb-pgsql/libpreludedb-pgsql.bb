SUMMARY = "Plugin to use prelude with a pgsql database"
DESCRIPTION = "This plugin allows prelude to store alerts into a pgsql database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-pgsql-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "ba4be2a3c97056bbaafe2fe6fde47d883b72cd9f13e24cca32c58ae16c9a3f6b191fe7d03c8a27f5ed98a515d49d08a0cc1ee076fb669ea4093b757ddb09d3a1"

RPROVIDES:${PN} += "libpreludedb-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
libprelude.so.28 \
libpreludedb-plugins \
libpreludedb.so.7 \
postgresql-server"

inherit rpm

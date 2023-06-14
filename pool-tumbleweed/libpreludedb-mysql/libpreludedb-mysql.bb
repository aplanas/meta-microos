SUMMARY = "Plugin to use prelude with a mysql database"
DESCRIPTION = "This plugin allows prelude to store alerts into a mysql database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-mysql-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "7bbdbd4f6c97811e078ea240c6afb8f9156fc8c538fc5c742cae1a6a6832af85526f6f3acf617f05e614c3b0f8e0d2bc7976719786adf12e6c888d8c75feaef2"

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

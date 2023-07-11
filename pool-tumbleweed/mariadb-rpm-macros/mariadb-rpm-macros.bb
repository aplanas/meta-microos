SUMMARY = "MariaDB RPM macros"
DESCRIPTION = "Provides macros usable in rpm spec files."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "11.0.2"

RPM_NAME = "mariadb-rpm-macros-11.0.2-1.1.aarch64.rpm"
RPM_HASH = "05c6deaf2cc1a2cef779dc6d78b4078915b5fa98fd4bebcb711a29406e8d3e9374d5ec6a1a63d7015bf4b982aec739aafdb082fabcbc32b9742ca700d31aecf8"

RPROVIDES:${PN} += "mariadb-rpm-macros \
rpm-macro-mysql-testserver-cconf \
rpm-macro-mysql-testserver-start \
rpm-macro-mysql-testserver-stop"

RDEPENDS:${PN} += "mariadb"

inherit rpm

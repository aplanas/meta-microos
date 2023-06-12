SUMMARY = "MariaDB RPM macros"
DESCRIPTION = "Provides macros usable in rpm spec files."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "mariadb-rpm-macros-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "ed65b630a2d843d435bc2a72b241bcaf2df2461299469de093881a085fc21e93d37f7a78f169ca75a5bb1c87332e7e529ea17ce6622f05f2d2ce5aa3be9790a0"

RPROVIDES:${PN} += "mariadb-rpm-macros \
mariadb-rpm-macros(aarch-64) \
rpm_macro(mysql_testserver_cconf) \
rpm_macro(mysql_testserver_start) \
rpm_macro(mysql_testserver_stop)"
RDEPENDS:${PN} += "mariadb"

inherit rpm

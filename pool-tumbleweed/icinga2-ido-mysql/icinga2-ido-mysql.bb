SUMMARY = "IDO MySQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO mysql database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-ido-mysql-2.13.7-1.4.aarch64.rpm"
RPM_HASH = "2fecab8fd1699da05fa48c27de2a6712f5af44e5aae63bc7e9cd5dda370cb5e58d3a2b4d247dae7eecb66d8301788eaf1d23582303423f512c923b20387c1c87"

RPROVIDES:${PN} += "config(icinga2-ido-mysql) \
icinga2-ido-mysql \
icinga2-ido-mysql(aarch-64) \
libmysql_shim.so.2.13.7()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
icinga2-bin \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

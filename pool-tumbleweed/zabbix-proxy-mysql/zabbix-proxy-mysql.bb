SUMMARY = "Zabbix proxy with MySQL support"
DESCRIPTION = "The Zabbix proxy compiled with MySQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-mysql-6.0.17-1.2.aarch64.rpm"
RPM_HASH = "112bb28a6d189d09cf43f781152cec1fc9db46cb1f26d2b3582381ebf9d68fd36b3df92a72739e37f309d98c595d53da89c8ce824a1f7f1d32ec9f8865daa51b"

RPROVIDES:${PN} += "zabbix \
zabbix-proxy-binary \
zabbix-proxy-mysql"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIposix.so.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libevent-2.1.so.7 \
liblber.so.2 \
libldap.so.2 \
libm.so.6 \
libmariadb.so.3 \
libnetsnmp.so.40 \
libodbc.so.2 \
libpcre.so.1 \
libssh2.so.1 \
libssl.so.3 \
libxml2.so.2 \
libz.so.1 \
mariadb \
update-alternatives \
zabbix-proxy"

inherit rpm

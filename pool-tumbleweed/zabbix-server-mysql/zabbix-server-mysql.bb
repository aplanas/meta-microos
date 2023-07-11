SUMMARY = "Zabbix server with MySQL support"
DESCRIPTION = "The Zabbix server compiled with MySQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-server-mysql-6.0.17-1.2.aarch64.rpm"
RPM_HASH = "c82b08fef0041874dcf0c1aae083d8c810236c91b32c94e70b8c4705b749686d318806380838c7b820019842c2e00dd918743535d5fda0a5b0ed71b4951d3da1"

RPROVIDES:${PN} += "zabbix \
zabbix-server-binary \
zabbix-server-mysql"

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
zabbix-server"

inherit rpm

SUMMARY = "Zabbix server with MySQL support"
DESCRIPTION = "The Zabbix server compiled with MySQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-server-mysql-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "075b45409ef231b746b3196943aa6b9fa1102dfb15fd4dd255b24323c8a5a2fc83f60b5ee91e23cc042f5d97d806622668f7b580d7881bc6c212379cdaa02209"

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

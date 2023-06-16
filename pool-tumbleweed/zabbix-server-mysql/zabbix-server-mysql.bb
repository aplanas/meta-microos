SUMMARY = "Zabbix server with MySQL support"
DESCRIPTION = "The Zabbix server compiled with MySQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-server-mysql-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "070c53b7b49704997c4d484492426204070e2cc7a70d34731e0164a6008a76122b2afde56333697fb9dc6a767324a386e4a4df15bbe4dfbad3a76954c5c66566"

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

SUMMARY = "Zabbix proxy with MySQL support"
DESCRIPTION = "The Zabbix proxy compiled with MySQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-mysql-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "338f7d09a4b4654898d65e8003c1b13a653b1971773b35fefbaf860ada7dffcad48e5c45f12f7ff778335b5c786d0086f4833cc9d95823ff68bcd64fc566f62b"

RPROVIDES:${PN} += "zabbix \
zabbix-proxy-mysql \
zabbix-proxy-mysql(aarch-64) \
zabbix_proxy_binary"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libOpenIPMI.so.0()(64bit) \
libOpenIPMIposix.so.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libevent-2.1.so.7()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libm.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmariadb_3)(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libnetsnmp.so.40()(64bit) \
libodbc.so.2()(64bit) \
libpcre.so.1()(64bit) \
libssh2.so.1()(64bit) \
libssl.so.3()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
mariadb \
update-alternatives \
zabbix-proxy"

inherit rpm

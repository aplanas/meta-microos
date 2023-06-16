SUMMARY = "Zabbix proxy with MySQL support"
DESCRIPTION = "The Zabbix proxy compiled with MySQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-mysql-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "338f7d09a4b4654898d65e8003c1b13a653b1971773b35fefbaf860ada7dffcad48e5c45f12f7ff778335b5c786d0086f4833cc9d95823ff68bcd64fc566f62b"

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

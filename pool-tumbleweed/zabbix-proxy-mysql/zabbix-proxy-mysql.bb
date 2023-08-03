SUMMARY = "Zabbix proxy with MySQL support"
DESCRIPTION = "The Zabbix proxy compiled with MySQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-proxy-mysql-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "b3e0c0d1717dbdd227cac9ab14f16969b3f72c83f40d350cd29b0c03a9d3623953c9f0b66e849421c6557663a5c4cc2385d0f2876f0f42ac254657177ffac189"

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

SUMMARY = "Zabbix proxy with SQLite support"
DESCRIPTION = "The Zabbix proxy compiled with SQLite support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-proxy-sqlite-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "7c738f45cfd7dd2971fa4e61a1b50acf108a737f4d66e63329c3871b55af914872f18ef16358fc7446ba61a25eab49a0146ee233de081c28601f34c4530daa40"

RPROVIDES:${PN} += "zabbix \
zabbix-proxy-binary \
zabbix-proxy-sqlite"

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
libnetsnmp.so.40 \
libodbc.so.2 \
libpcre.so.1 \
libsqlite3.so.0 \
libssh2.so.1 \
libssl.so.3 \
libxml2.so.2 \
libz.so.1 \
update-alternatives \
zabbix-proxy"

inherit rpm

SUMMARY = "Zabbix proxy with SQLite support"
DESCRIPTION = "The Zabbix proxy compiled with SQLite support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-sqlite-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "5f20ae3bb7f0c36505d46e63284532b7a019bca499b34b2f166bed862cb4c979e08cdac5a789328b0b835a00288e110353a532fcfcea7246993a92e6620b9353"

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

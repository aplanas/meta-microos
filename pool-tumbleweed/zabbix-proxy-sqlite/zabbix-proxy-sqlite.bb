SUMMARY = "Zabbix proxy with SQLite support"
DESCRIPTION = "The Zabbix proxy compiled with SQLite support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-sqlite-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "5f20ae3bb7f0c36505d46e63284532b7a019bca499b34b2f166bed862cb4c979e08cdac5a789328b0b835a00288e110353a532fcfcea7246993a92e6620b9353"

RPROVIDES:${PN} += "zabbix \
zabbix-proxy-sqlite \
zabbix-proxy-sqlite(aarch-64) \
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
libnetsnmp.so.40()(64bit) \
libodbc.so.2()(64bit) \
libpcre.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libssh2.so.1()(64bit) \
libssl.so.3()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
update-alternatives \
zabbix-proxy"

inherit rpm

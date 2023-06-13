SUMMARY = "Zabbix proxy with PostgreSQL support"
DESCRIPTION = "The Zabbix proxy compiled with PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-postgresql-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "cca91638bb7e1534bdaa7c6d163eb1b0c2b8a14b1521bcee6c52cec93465a002ba124871bfd750fa985cf9a8cef48410dd93f75c6991f53fcdae956776149466"

RPROVIDES:${PN} += "zabbix \
zabbix-proxy-postgresql \
zabbix-proxy-postgresql(aarch-64) \
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
libpq.so.5()(64bit) \
libssh2.so.1()(64bit) \
libssl.so.3()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
postgresql \
update-alternatives \
zabbix-proxy"

inherit rpm

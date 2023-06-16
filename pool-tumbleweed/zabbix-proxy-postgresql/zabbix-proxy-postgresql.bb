SUMMARY = "Zabbix proxy with PostgreSQL support"
DESCRIPTION = "The Zabbix proxy compiled with PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-postgresql-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "cca91638bb7e1534bdaa7c6d163eb1b0c2b8a14b1521bcee6c52cec93465a002ba124871bfd750fa985cf9a8cef48410dd93f75c6991f53fcdae956776149466"

RPROVIDES:${PN} += "zabbix \
zabbix-proxy-binary \
zabbix-proxy-postgresql"

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
libpq.so.5 \
libssh2.so.1 \
libssl.so.3 \
libxml2.so.2 \
libz.so.1 \
postgresql \
update-alternatives \
zabbix-proxy"

inherit rpm

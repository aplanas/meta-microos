SUMMARY = "Zabbix server with PostgreSQL support"
DESCRIPTION = "The Zabbix server compiled with PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-server-postgresql-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "94d0361cda30ee3b320aa220d7fc9a9257a637edd278671437013f478cad8f953c9b2471fd6d52be7a0f3cb794676056eac33d89d7cf09e33b1890ff75ad6189"

RPROVIDES:${PN} += "zabbix \
zabbix-server-binary \
zabbix-server-postgresql"

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
zabbix-server"

inherit rpm

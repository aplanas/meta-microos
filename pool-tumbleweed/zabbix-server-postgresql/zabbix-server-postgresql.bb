SUMMARY = "Zabbix server with PostgreSQL support"
DESCRIPTION = "The Zabbix server compiled with PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-server-postgresql-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "0aac9200d95498a67226543ae8d4f9d12a427e013bd6f9f75fd689c801883f139664c0a556fcdaf3ef2151b3688e5c6eef8a2a3d6d06e7f2edd09637f0420b98"

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

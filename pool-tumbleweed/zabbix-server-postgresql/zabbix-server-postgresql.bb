SUMMARY = "Zabbix server with PostgreSQL support"
DESCRIPTION = "The Zabbix server compiled with PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-server-postgresql-6.0.17-1.2.aarch64.rpm"
RPM_HASH = "7914d6faf609bc7836b1bdb7d3661f3b16137b17319ef75b2b452cddf6fbee7f2bf55dc8d8e22dd9c352bf4354bc3ce45bd1ca3e81f572d4526d0d57bcb3c509"

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

SUMMARY = "Zabbix proxy with PostgreSQL support"
DESCRIPTION = "The Zabbix proxy compiled with PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-proxy-postgresql-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "050866be22586c428589d0618894e5a9e387638c4ad0400ea5db5795b92fbec1d20e54577c240f9ab884d48b7b615bf434a1b1b1c6e2e185f89659859d090d6e"

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

SUMMARY = "Zabbix proxy with SQLite support"
DESCRIPTION = "The Zabbix proxy compiled with SQLite support."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-sqlite-6.0.17-1.2.aarch64.rpm"
RPM_HASH = "bd8ba4ece3349b7630904b4ff093577ccc5774b87ad0b54676a38b1c0759a2f50e6a9145868c101cb1efcdc17702f503b6139d76be6d0d6c1e345c28cd50b552"

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

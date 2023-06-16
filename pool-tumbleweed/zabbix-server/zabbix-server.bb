SUMMARY = "System files for the Zabbix server"
DESCRIPTION = "The Zabbix server component."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-server-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "59abec4f12c4267fc49e9be8743b0905655c9c948a0452a2469f6fa5ecb2022c1eabd69cab980021929ae4a03028a9199ede735bdb632450f5fc351c6c769247"

RPROVIDES:${PN} += "config-zabbix-server \
zabbix-server"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
fping \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libm.so.6 \
libpcre.so.1 \
libssl.so.3 \
libxml2.so.2 \
libz.so.1 \
logrotate \
shadow \
update-alternatives \
zabbix-server-binary"

inherit rpm

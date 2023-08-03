SUMMARY = "System files for the Zabbix server"
DESCRIPTION = "The Zabbix server component."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-server-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "4f86a4a5b01a875da9c129bd283d97b6283bf88ed5fc88568f418baaa5e6bdfd3e1cc921c7ce37bcf88758cf41195554fb94f67db9c698188023ad751b5a2033"

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

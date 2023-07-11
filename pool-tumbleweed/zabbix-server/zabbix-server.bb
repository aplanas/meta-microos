SUMMARY = "System files for the Zabbix server"
DESCRIPTION = "The Zabbix server component."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-server-6.0.17-1.2.aarch64.rpm"
RPM_HASH = "a643beb4208e9afbd368cf14b4fb95ab95b4944c2778c2efeea6e04290cb6f76bab66f8cede6f6e8b61561f7fd53b0e6c084ad0b63d6f3a25db47e053e621c99"

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

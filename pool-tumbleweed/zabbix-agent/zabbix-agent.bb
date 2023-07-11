SUMMARY = "Local resource monitor agent for Zabbix"
DESCRIPTION = "The Zabbix agent monitors local resources and relays information to the server."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-agent-6.0.17-1.2.aarch64.rpm"
RPM_HASH = "d823c4ab4176adbf47c51832bf5b8a8797ca9c934088516ca39f890eafe529b0f1c7d3604f43be5d4f271ed7d9d1e14a131d4305e082358b440eb61c653f44d3"

RPROVIDES:${PN} += "config-zabbix-agent \
zabbix-agent"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
liblber.so.2 \
libldap.so.2 \
libpcre.so.1 \
libssl.so.3 \
libz.so.1 \
logrotate \
shadow"

inherit rpm

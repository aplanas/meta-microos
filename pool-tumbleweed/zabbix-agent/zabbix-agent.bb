SUMMARY = "Local resource monitor agent for Zabbix"
DESCRIPTION = "The Zabbix agent monitors local resources and relays information to the server."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-agent-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "61d526d1f96387b4937d564d009d7ade6af8b8b0d3ebc6eca720eec2ead8ae12d9e51ab6c5fa33f1fcf3617df95b1e2b55bf043eca41bdf17784e301b6f2c919"

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

SUMMARY = "Local resource monitor agent for Zabbix"
DESCRIPTION = "The Zabbix agent monitors local resources and relays information to the server."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-agent-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "ffde9e65d2e2f61941526a36e59abc54e8496681f5eb7f9b67ed41e7a60ebe8c0ffb248e1869977e05f4d01f1fbf631066735a7dec141bbab2f0d073a95e1e83"

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

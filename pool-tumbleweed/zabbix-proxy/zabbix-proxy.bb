SUMMARY = "System files for the Zabbix proxy"
DESCRIPTION = "The Zabbix proxy component."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "39f9943b7cc5dcac9d13c60f423b44657a2fddce42f0b3f21feac272889a118eff9e0681ce761c276d80dcd6feef87c41aab6a33042a9b1a9e946a8930ab1b84"

RPROVIDES:${PN} += "config(zabbix-proxy) \
zabbix-proxy \
zabbix-proxy(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
fping \
logrotate \
shadow \
update-alternatives \
zabbix_proxy_binary"

inherit rpm

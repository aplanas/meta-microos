SUMMARY = "System files for the Zabbix proxy"
DESCRIPTION = "The Zabbix proxy component."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-proxy-6.0.17-1.2.aarch64.rpm"
RPM_HASH = "0fb46429361f26dfbe5c1aa5d79620e65c658db40a7a5326a7d2833a2acb8d936a7e91e4c143c8daf095dd12822b75cf32beac620e05f2c57d6ddab10ff6f159"

RPROVIDES:${PN} += "config-zabbix-proxy \
zabbix-proxy"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
fping \
logrotate \
shadow \
update-alternatives \
zabbix-proxy-binary"

inherit rpm

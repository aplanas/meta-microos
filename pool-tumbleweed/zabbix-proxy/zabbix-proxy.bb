SUMMARY = "System files for the Zabbix proxy"
DESCRIPTION = "The Zabbix proxy component."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-proxy-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "bea6ad214db01297f819bcc5e0bdef66889d762d87ffed92011745f5ecfcf4f3a96366c1f79017720a2d20c19f21b88741b048aef466a3bf84d81f287dd72152"

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

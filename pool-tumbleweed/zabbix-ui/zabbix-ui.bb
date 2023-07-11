SUMMARY = "Zabbix web frontend (php)"
DESCRIPTION = "The Zabbix PHP frontend allows access via standard web browsers. \
 \
NOTE: You still have to install the PHP package which contains your db driver!"
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-ui-6.0.17-1.2.aarch64.rpm"
RPM_HASH = "d0a54bc7067697bd0176c216da3d4764f3b723b23e039e63ae70219df825d7c882f3c6b67f577d90d7ffafd396322d3b76fc716114e8bc019c57f5d09bee5f73"

RPROVIDES:${PN} += "config-zabbix-ui \
zabbix-ui"

RDEPENDS:${PN} += "/usr/bin/bash \
apache2 \
php8 \
php8-bcmath \
php8-ctype \
php8-gd \
php8-gettext \
php8-ldap \
php8-mbstring \
php8-sockets \
php8-xmlreader \
php8-xmlwriter"

inherit rpm

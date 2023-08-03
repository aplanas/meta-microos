SUMMARY = "Zabbix web frontend (php)"
DESCRIPTION = "The Zabbix PHP frontend allows access via standard web browsers. \
 \
NOTE: You still have to install the PHP package which contains your db driver!"
LICENSE = "GPL-2.0-or-later"

PV = "6.0.19"

RPM_NAME = "zabbix-ui-6.0.19-1.1.aarch64.rpm"
RPM_HASH = "4337045e840b7f4deccfe72cb26bc0db2705e63be7c78c5ac653840601b18af21d0db7ba0b9fdad0f28bf2287ea9bd1918a0453cc169f17f32d9ec4e7e201400"

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

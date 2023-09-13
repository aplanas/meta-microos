SUMMARY = "Web Front-End to Monitor System Data via RRDtool"
DESCRIPTION = "Cacti is a complete front-end to RRDtool: it stores all necessary \
information for creating graphs and populates them with data from a \
MySQL database. The front-end is completely PHP driven. Along with \
being ableto maintain graphs, data sources, and round robin archives \
ina database, Cacti also handles data gathering. There exists an SNMP \
support for those accustomed to creating traffic graphs with MRTG as \
well."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.25"

RPM_NAME = "cacti-1.2.25-2.1.noarch.rpm"
RPM_HASH = "68b679f1282024238d9092c35854de4ad12f6433eaa856303af9afe9c11a15a606df87081634d16809ed02fae5ce8fcfa1fdefe708eed0d39262fa4f80425c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cacti \
cacti-PA \
cacti-system \
config-cacti"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/php \
/usr/bin/sh \
httpd \
logrotate \
mod-php-any \
net-snmp \
php-ctype \
php-gd \
php-gmp \
php-json \
php-ldap \
php-mbstring \
php-mysql \
php-openssl \
php-posix \
php-snmp \
php-sockets \
php-zlib \
rrdtool \
systemd"

inherit rpm

SUMMARY = "Web Front-End to Monitor System Data via RRDtool"
DESCRIPTION = "Cacti is a complete front-end to RRDtool: it stores all necessary \
information for creating graphs and populates them with data from a \
MySQL database. The front-end is completely PHP driven. Along with \
being ableto maintain graphs, data sources, and round robin archives \
ina database, Cacti also handles data gathering. There exists an SNMP \
support for those accustomed to creating traffic graphs with MRTG as \
well."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.24"

RPM_NAME = "cacti-1.2.24-1.2.noarch.rpm"
RPM_HASH = "ccf3fa81845a1859194d6a7b3a4c2da549cfc4a0b97e631fe38432cdf880dcca0680ef335b43f5528e94f3aa44c6b5a1b72b210e1ff37c70c474af5a1a65939c"
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

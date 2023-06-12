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

RPM_NAME = "cacti-1.2.24-1.1.noarch.rpm"
RPM_HASH = "14258c3f6d9d65dd4bacec455cfc8a693dcbeba535561525579fc18fa70a02a9ea511cfdd2646fd25ae81f468afc106d8a228113577e0334636d5f6039742711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cacti \
cacti-PA \
cacti-system \
config(cacti)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/php \
httpd \
logrotate \
mod_php_any \
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

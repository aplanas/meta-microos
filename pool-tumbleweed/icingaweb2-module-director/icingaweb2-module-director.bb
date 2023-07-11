SUMMARY = "Config module for Icinga Web 2"
DESCRIPTION = "Director is an config module for icingaweb2"
LICENSE = "GPL-2.0-or-later"

PV = "1.10.2"

RPM_NAME = "icingaweb2-module-director-1.10.2-1.4.noarch.rpm"
RPM_HASH = "09b5fbab5a2196a8c0a3db6a299f2956afaa4edab23c1362f630aefef6f6c0ad1b6615d323c8413c6a4de7edf9aa022871ac8032a728830723b7468d23131dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-module-director"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
icinga2 \
icingaweb2 \
icingaweb2-module-incubator \
icingaweb2-module-ipl \
icingaweb2-module-reactbundle \
php \
php-curl \
php-iconv \
php-pcntl \
php-posix \
php-sockets \
systemd"

inherit rpm

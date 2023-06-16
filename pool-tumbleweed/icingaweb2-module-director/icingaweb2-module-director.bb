SUMMARY = "Config module for Icinga Web 2"
DESCRIPTION = "Director is an config module for icingaweb2"
LICENSE = "GPL-2.0-or-later"

PV = "1.10.2"

RPM_NAME = "icingaweb2-module-director-1.10.2-1.3.noarch.rpm"
RPM_HASH = "23084e9ba3baff0ed3610bd4f7f72c72fb99a3dbab89e5473cf72ab1cc817f4d65adbb3b3884e6be54ef847cbfabd0aaefa76c97d97542fad28b897a83de866a"
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

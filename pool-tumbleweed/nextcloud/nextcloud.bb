SUMMARY = "File hosting service"
DESCRIPTION = "Nextcloud is a suite of client-server software for creating file \
hosting services and using them."
LICENSE = "AGPL-3.0-only"

PV = "26.0.4"

RPM_NAME = "nextcloud-26.0.4-1.1.noarch.rpm"
RPM_HASH = "5f6152be50ae5ce2a3129889a7fb2720c0c9e871bcc799f4faf0e22793207f897664ef239260b641f2d785dadffb112328eb317dd76ae29c364cd73528aba3db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-nextcloud \
nextcloud"

RDEPENDS:${PN} += "/usr/bin/sh \
cron \
curl \
libxml2-2 \
mariadb \
php-bz2 \
php-ctype \
php-curl \
php-dom \
php-fileinfo \
php-ftp \
php-gd \
php-iconv \
php-intl \
php-json \
php-ldap \
php-mbstring \
php-mysql \
php-opcache \
php-openssl \
php-pear \
php-posix \
php-xmlreader \
php-xmlwriter \
php-zip \
php-zlib \
systemd"

inherit rpm

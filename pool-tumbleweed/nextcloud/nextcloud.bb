SUMMARY = "File hosting service"
DESCRIPTION = "Nextcloud is a suite of client-server software for creating file \
hosting services and using them."
LICENSE = "AGPL-3.0-only"

PV = "26.0.5"

RPM_NAME = "nextcloud-26.0.5-1.1.noarch.rpm"
RPM_HASH = "eb8dcc2fbb76a275b07d55f16ecd22bf48c91d80a0b3a2281545371f783d46fe55d81662ea83448d8ce76dfeb849c0e0f8f4b379b9649e1194f2cd3609a18cf4"
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

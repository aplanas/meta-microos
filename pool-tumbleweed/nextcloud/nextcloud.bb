SUMMARY = "File hosting service"
DESCRIPTION = "Nextcloud is a suite of client-server software for creating file \
hosting services and using them."
LICENSE = "AGPL-3.0-only"

PV = "26.0.3"

RPM_NAME = "nextcloud-26.0.3-1.1.noarch.rpm"
RPM_HASH = "4ec0f8e01834b7ce703a583f4a0b550ca7bc68ead0b8fe5914aed6eb22130514a34a53354a0f68ed5207717f429abad83c43360421ac7ddec15d689904d41b32"
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

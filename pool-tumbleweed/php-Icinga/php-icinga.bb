SUMMARY = "Icinga Web 2 PHP library"
DESCRIPTION = "Icinga Web 2 PHP library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "php-Icinga-2.11.4-3.1.noarch.rpm"
RPM_HASH = "1c676e84eef66ef257c526c4a6ba2d29e2296294df4de4e77f99338a120eecef15a399ce91e5263632712d125e0d0666e37ca07b86d48fd0daa5ed33ea79b5d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-Icinga"

RDEPENDS:${PN} += "/usr/bin/sh \
icingaweb2-vendor-zf1 \
php \
php-ctype \
php-curl \
php-dom \
php-fileinfo \
php-gd \
php-gettext \
php-imagick \
php-intl \
php-json \
php-mbstring \
php-openssl \
php-pdo \
php-posix \
php-xml"

inherit rpm

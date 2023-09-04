SUMMARY = "Dependency Management for PHP"
DESCRIPTION = "Composer is a dependency manager tracking local dependencies of your projects \
and libraries."
LICENSE = "MIT"

PV = "2.5.8"

RPM_NAME = "php-composer2-2.5.8-1.1.noarch.rpm"
RPM_HASH = "0d4e65066b297017b63cd0ecbdc154538cceb2894ac4d3b5c919c85da37c788b1d81547a688bacab30b7361c647eab357a7fbae571b038be745f773b108723f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "composer \
php-composer \
php-composer2 \
php7-composer"

RDEPENDS:${PN} += "/usr/bin/sh \
php \
php-curl \
php-json \
php-mbstring \
php-openssl \
php-phar \
php-zip \
php-zlib \
update-alternatives"

inherit rpm

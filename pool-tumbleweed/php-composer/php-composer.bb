SUMMARY = "Dependency Management for PHP"
DESCRIPTION = "Composer is a dependency manager tracking local dependencies of your projects \
and libraries."
LICENSE = "MIT"

PV = "1.10.26"

RPM_NAME = "php-composer-1.10.26-2.2.noarch.rpm"
RPM_HASH = "5098b8ca9e0aadf5c8a04cb8f58fd0cbd559db9bdba1a7fc1d93ca8ee41188c2b95bf1e7ba77fa32b04c297195baa4f2c8fae2341cfb48febe171d3e78bcacf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "composer \
php-composer \
php5-composer \
php7-composer \
php8-composer"

RDEPENDS:${PN} += "php \
php-intl \
php-json \
php-mbstring \
php-openssl \
php-phar \
php-zip \
php-zlib"

inherit rpm

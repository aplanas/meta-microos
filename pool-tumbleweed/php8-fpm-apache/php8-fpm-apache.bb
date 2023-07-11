SUMMARY = "Apache configuration for PHP-FPM"
DESCRIPTION = "Configuration for Apache to pass all requests for PHP scripts to the \
PHP-FPM server using reverse proxy."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-fpm-apache-8.2.7-1.1.noarch.rpm"
RPM_HASH = "bf79f30f7981753e95c2fa8a777a270f1f62590cce239be2341786568db881305ade7ffe59f96c503e9cb4a7b2b592d2f1a183ea629638bdb3e762e76b02a48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-php8-fpm-apache \
php8-fpm-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/a2enmod \
apache2 \
php-fpm"

inherit rpm

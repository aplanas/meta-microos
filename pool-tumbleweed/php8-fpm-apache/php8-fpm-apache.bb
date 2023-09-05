SUMMARY = "Apache configuration for PHP-FPM"
DESCRIPTION = "Configuration for Apache to pass all requests for PHP scripts to the \
PHP-FPM server using reverse proxy."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-fpm-apache-8.2.10-1.1.noarch.rpm"
RPM_HASH = "0c4cdc1c180748a8c9688507e8f7a659d389d4ae153350011c40036cfa428e88dc8f40bdf13867e0b4fe47250023cfc3a300e1e5218e8ed462fab91bc3959abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-php8-fpm-apache \
php8-fpm-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/a2enmod \
apache2 \
php-fpm"

inherit rpm

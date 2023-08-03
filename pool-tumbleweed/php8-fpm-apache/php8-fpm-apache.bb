SUMMARY = "Apache configuration for PHP-FPM"
DESCRIPTION = "Configuration for Apache to pass all requests for PHP scripts to the \
PHP-FPM server using reverse proxy."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-fpm-apache-8.2.8-1.1.noarch.rpm"
RPM_HASH = "d033b5ce2719673f138d0360b4096a3f9ce90a19922867e4260b807a2ab53a33a888cdbb280344033e8051abd5fad8ea63eaaabe6d5dcd6a09e5aceffaf575ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-php8-fpm-apache \
php8-fpm-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/a2enmod \
apache2 \
php-fpm"

inherit rpm

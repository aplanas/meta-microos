SUMMARY = "Apache configuration for PHP-FPM"
DESCRIPTION = "Configuration for Apache to pass all requests for PHP scripts to the \
PHP-FPM server using reverse proxy."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-fpm-apache-8.2.9-1.1.noarch.rpm"
RPM_HASH = "f862919b6d3d3037689594abdc3b78e5ce5ffd717e5a37b0cd49f2628a671126806aa6f6ad25749e6a69333788541761efbbfebe35af67be6f59a7e7459dc0f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-php8-fpm-apache \
php8-fpm-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/a2enmod \
apache2 \
php-fpm"

inherit rpm

SUMMARY = "Apache configuration for PHP-FPM"
DESCRIPTION = "Configuration for Apache to pass all requests for PHP scripts to the \
PHP-FPM server using reverse proxy."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-fpm-apache-8.2.10-2.1.noarch.rpm"
RPM_HASH = "e4cd412c6c38a6c142d24b0a4856a2db843f43c952ed8e7fee2f386b9eb7554d9539271590d3961b25f3959e44e8736fe8df711c13d6bd020955f020b8eba6dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-php8-fpm-apache \
php8-fpm-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/a2enmod \
apache2 \
php-fpm"

inherit rpm

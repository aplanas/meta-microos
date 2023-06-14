SUMMARY = "Apache configuration for PHP-FPM"
DESCRIPTION = "Configuration for Apache to pass all requests for PHP scripts to the \
PHP-FPM server using reverse proxy."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-fpm-apache-8.1.19-2.1.noarch.rpm"
RPM_HASH = "a634f37c784bb31ce676a24aadf1459edf30018e1dd800843e2062f95cc9aef61841321f1bb196366753ed29fc2563314d27fc550cadb62fee5dd164e1555327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-php8-fpm-apache \
php8-fpm-apache"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/a2enmod \
apache2 \
php-fpm"

inherit rpm

SUMMARY = "Apache configuration for phpMyAdmin"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-2.0-or-later"

PV = "5.2.1"

RPM_NAME = "phpMyAdmin-apache-5.2.1-3.1.noarch.rpm"
RPM_HASH = "7b9e25dac8a06ef54edbc92e943a5e93b2b65fcc81ef1cab52daa567519c9569717fb02bb62d6aba31f99ba776447606c467f66258f31acab89801d3821dea76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phpMyAdmin-apache \
phpMyAdmin-apache"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/a2enflag \
/usr/sbin/a2enmod \
apache2 \
mod-php-any \
php \
phpMyAdmin"

inherit rpm

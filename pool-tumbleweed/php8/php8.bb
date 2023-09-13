SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the base files for all subpackages and \
must be installed in order to use PHP. Additionally, extension \
modules and server modules (e.g. for Apache) may be installed."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "ddd2020c1e37fb7c70044b663226dcfafb4fe134596c6aa89c808607bc309169588f86e67b340390fcf12d60e4e06f113291a73b307de689984053e49fe8f5da"

RPROVIDES:${PN} += "php \
php-api \
php-date \
php-filter \
php-hash \
php-json \
php-pcre \
php-reflection \
php-session \
php-simplexml \
php-spl \
php-xml \
php-zend-abi \
php8 \
zend"

RDEPENDS:${PN} += "php-sapi \
timezone"

inherit rpm

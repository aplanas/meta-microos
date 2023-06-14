SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the base files for all subpackages and \
must be installed in order to use PHP. Additionally, extension \
modules and server modules (e.g. for Apache) may be installed."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "667032e6a40c8b6bbffb6dc3857fb7e30af14948c0835b8500675ccc71f5c0553b38ce6f51cfe8cc93afb39a41ce003dc3bebaa6a2323eb87fa9dd694eb7026b"

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

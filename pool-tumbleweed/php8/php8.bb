SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the base files for all subpackages and \
must be installed in order to use PHP. Additionally, extension \
modules and server modules (e.g. for Apache) may be installed."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "d4c1616b05e20ecbb056142db249282f782cfc3a6c4ee144fa02a2de9e5d240ea824c50d2163fc774b9fb37b9c31ab29ea5bbdb8afa23f02845f80a970e0d8a7"

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

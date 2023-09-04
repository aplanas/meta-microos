SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the base files for all subpackages and \
must be installed in order to use PHP. Additionally, extension \
modules and server modules (e.g. for Apache) may be installed."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "cac4480922167c82b926c9b511669f8be26b941318efe59bf2f93893cc3d58afff98eb3248fc23ffd5f55bf2c6e9a112adc6a435b9d4b84d756b9c5685eedf24"

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

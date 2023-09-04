SUMMARY = "Extended PHP debugger"
DESCRIPTION = "The Xdebug extension helps debugging scripts by providing \
debug information such as: \
 \
  * stack and function traces in error messages with: \
    o full parameter display for user defined functions \
    o function name, file name and line indications \
    o support for member functions \
  * memory allocation \
  * protection for infinite recursions \
 \
Xdebug also provides: \
 \
  * profiling information for PHP scripts \
  * code coverage analysis \
  * capabilities to debug your scripts interactively with a debug client"
LICENSE = "PHP-3.0"

PV = "3.2.2"

RPM_NAME = "php8-xdebug-3.2.2-3.1.aarch64.rpm"
RPM_HASH = "90690cade66b0dd95faaa260d9bd3b495605e5a0914bbc8d6717e29f658df96d5ef8b643715f8f352cab022f835cacf5f16d40070f4602f8bf334d5b9cd7275b"

RPROVIDES:${PN} += "config-php8-xdebug \
php-xdebug \
php8-xdebug"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
php-api \
php-zend-abi"

inherit rpm

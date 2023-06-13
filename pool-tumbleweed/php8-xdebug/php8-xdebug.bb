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

PV = "3.2.1"

RPM_NAME = "php8-xdebug-3.2.1-2.3.aarch64.rpm"
RPM_HASH = "db504eab314e8fe770136552859c0887b225b50415a2b696f2d2d5f24b3a5fd9550785be33fe95c52612f65ed682c6efaa6920820ae8ec0dc32081009d097302"

RPROVIDES:${PN} += "config(php8-xdebug) \
php-xdebug \
php8-xdebug \
php8-xdebug(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.9)(64bit) \
php(api) \
php(zend-abi)"

inherit rpm

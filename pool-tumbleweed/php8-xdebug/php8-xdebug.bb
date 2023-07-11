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

RPM_NAME = "php8-xdebug-3.2.1-2.5.aarch64.rpm"
RPM_HASH = "5c08d51a57e511895c12a7884fc094d101db20a76e64f2bd5a121275ae44f81fbe5520642edd01e130e13c564794ec916f6a4715621d9bb0bf1497e426f2619e"

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

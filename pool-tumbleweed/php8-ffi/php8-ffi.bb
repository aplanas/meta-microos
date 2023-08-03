SUMMARY = "Main interface to C code and data"
DESCRIPTION = "This extension allows the loading of shared libraries (.DLL or .so), \
calling of C functions and accessing of C data structures in pure PHP, \
without having to have deep knowledge of the Zend extension API, and \
without having to learn a third 'intermediate' language."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-ffi-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "21e2224e78983bfe9fa142d3326059ecae9cb232d7ff6a8d3eeef63d5675605c875abfc4d32e8b98170a2e73235986db4f489c4f5222cf1fba7d28d5e6e2e877"

RPROVIDES:${PN} += "config-php8-ffi \
php-ffi \
php8-ffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
php"

inherit rpm

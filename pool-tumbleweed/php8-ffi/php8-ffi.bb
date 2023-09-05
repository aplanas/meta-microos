SUMMARY = "Main interface to C code and data"
DESCRIPTION = "This extension allows the loading of shared libraries (.DLL or .so), \
calling of C functions and accessing of C data structures in pure PHP, \
without having to have deep knowledge of the Zend extension API, and \
without having to learn a third 'intermediate' language."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-ffi-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "f05aa2fba30dcd4968905140940232306cc64caf288a84b36ffb8d3db170a1c53e82f3704c8bd1b389b3cb08a102a0a0be10785c2f291412009fd0c0bdcd771b"

RPROVIDES:${PN} += "config-php8-ffi \
php-ffi \
php8-ffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
php"

inherit rpm

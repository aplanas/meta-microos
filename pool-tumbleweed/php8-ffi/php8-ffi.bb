SUMMARY = "Main interface to C code and data"
DESCRIPTION = "This extension allows the loading of shared libraries (.DLL or .so), \
calling of C functions and accessing of C data structures in pure PHP, \
without having to have deep knowledge of the Zend extension API, and \
without having to learn a third 'intermediate' language."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-ffi-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "25f646ed6be255ca44d6fde1121500beef991d6be96d73a68007d1acfe875f99c8f07fbbd2d858d3e0cfa32a89e202085cccc0eee5e2d80d4bf77ce074d67c27"

RPROVIDES:${PN} += "config-php8-ffi \
php-ffi \
php8-ffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
php"

inherit rpm

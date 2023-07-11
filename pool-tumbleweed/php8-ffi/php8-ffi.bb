SUMMARY = "Main interface to C code and data"
DESCRIPTION = "This extension allows the loading of shared libraries (.DLL or .so), \
calling of C functions and accessing of C data structures in pure PHP, \
without having to have deep knowledge of the Zend extension API, and \
without having to learn a third 'intermediate' language."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-ffi-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "102420ed1047f67632d24041f631f0dc8f5f4dce01cbe6ba88b185715031ea9b46d85d89116f3ffcfd09090ab0ba8019ddc4f90e6da9fb2203a57979d43f12ef"

RPROVIDES:${PN} += "config-php8-ffi \
php-ffi \
php8-ffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
php"

inherit rpm

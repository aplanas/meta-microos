SUMMARY = "Main interface to C code and data"
DESCRIPTION = "This extension allows the loading of shared libraries (.DLL or .so), \
calling of C functions and accessing of C data structures in pure PHP, \
without having to have deep knowledge of the Zend extension API, and \
without having to learn a third 'intermediate' language."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-ffi-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "1561e4e0470ed39705d6807173288240c3cea7302545b9619113eff114b72635dcbad02b5e0765dbabd50ac424570aa7132969c7a2463a99267e7e1e07b2b21d"

RPROVIDES:${PN} += "config-php8-ffi \
php-ffi \
php8-ffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
php"

inherit rpm

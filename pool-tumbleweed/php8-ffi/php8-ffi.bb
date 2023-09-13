SUMMARY = "Main interface to C code and data"
DESCRIPTION = "This extension allows the loading of shared libraries (.DLL or .so), \
calling of C functions and accessing of C data structures in pure PHP, \
without having to have deep knowledge of the Zend extension API, and \
without having to learn a third 'intermediate' language."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-ffi-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "aa821feb1f1660cd64d3795d05cc936953d52f0dfd5322a060f81e136944e14e861528a23de06660eba2cc8dccfc339b5c976ec2838588f123a3dc0348b3d7a9"

RPROVIDES:${PN} += "config-php8-ffi \
php-ffi \
php8-ffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
php"

inherit rpm

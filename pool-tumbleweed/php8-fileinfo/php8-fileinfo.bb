SUMMARY = "File identification extension for PHP"
DESCRIPTION = "The functions in this module try to guess the content type and \
encoding of a file by looking for certain magic byte sequences at \
specific positions within the file. It uses (a bundled version of) \
libmagic to heuristically determine this."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-fileinfo-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "44f4368acd2f71ea61d52ea597714ac8745921771274cccc8fe4a7e3add302221936d450b3031156d96c277c1b9efeada52c031634b45d1d4abd58d8449db3d2"

RPROVIDES:${PN} += "config-php8-fileinfo \
php-fileinfo \
php8-fileinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

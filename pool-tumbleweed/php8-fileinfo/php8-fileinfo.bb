SUMMARY = "File identification extension for PHP"
DESCRIPTION = "The functions in this module try to guess the content type and \
encoding of a file by looking for certain magic byte sequences at \
specific positions within the file. It uses (a bundled version of) \
libmagic to heuristically determine this."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-fileinfo-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "036ba4fbad22188d45c19f845e39af3182730008a02c196c615fd17cc6e58bed627c27f5243901a99960525aba171c279af65c1e1034fb575706009e05c1dae3"

RPROVIDES:${PN} += "config(php8-fileinfo) \
php-fileinfo \
php8-fileinfo \
php8-fileinfo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
php"

inherit rpm

SUMMARY = "File identification extension for PHP"
DESCRIPTION = "The functions in this module try to guess the content type and \
encoding of a file by looking for certain magic byte sequences at \
specific positions within the file. It uses (a bundled version of) \
libmagic to heuristically determine this."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-fileinfo-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "67155c3f057aa642adadfe15511c33c817f95bfda28801bbfd902387cb045b3f77710a30b44f9ab727b6cf81c219498d80579971e5b871741fc80828a072e9a0"

RPROVIDES:${PN} += "config-php8-fileinfo \
php-fileinfo \
php8-fileinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

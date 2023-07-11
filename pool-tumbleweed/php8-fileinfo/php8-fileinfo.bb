SUMMARY = "File identification extension for PHP"
DESCRIPTION = "The functions in this module try to guess the content type and \
encoding of a file by looking for certain magic byte sequences at \
specific positions within the file. It uses (a bundled version of) \
libmagic to heuristically determine this."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-fileinfo-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "19b60fb7e4bd5ffe9e100e9d8b7cd38ab73537943a03d8b0f63122fa610f778670db7b6fd086e26a20aa4ded473ed2bfe047b4eeaa5d5c73a1d7911f2bb1a64c"

RPROVIDES:${PN} += "config-php8-fileinfo \
php-fileinfo \
php8-fileinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

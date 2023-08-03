SUMMARY = "File identification extension for PHP"
DESCRIPTION = "The functions in this module try to guess the content type and \
encoding of a file by looking for certain magic byte sequences at \
specific positions within the file. It uses (a bundled version of) \
libmagic to heuristically determine this."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-fileinfo-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "939aff35e7db4b089affd8d9255e8f306cb8bfede823269e3bba9cb8b8c5e8834be53761859d98d7c92d61dbb2feb1ad4da3e56238c131c162ef210195c0f425"

RPROVIDES:${PN} += "config-php8-fileinfo \
php-fileinfo \
php8-fileinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

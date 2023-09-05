SUMMARY = "File identification extension for PHP"
DESCRIPTION = "The functions in this module try to guess the content type and \
encoding of a file by looking for certain magic byte sequences at \
specific positions within the file. It uses (a bundled version of) \
libmagic to heuristically determine this."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-fileinfo-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "4a92809f04065e38cf89189c37ac1749e92e1715ba76afd25f41e013579da3156a2c623295d3b4880c1cd5d209bd8a0d5f4e102b1347294e2627c1791924e639"

RPROVIDES:${PN} += "config-php8-fileinfo \
php-fileinfo \
php8-fileinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

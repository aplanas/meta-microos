SUMMARY = "EXIF metadata extensions for PHP"
DESCRIPTION = "PHP functions for extracting EXIF (Exchangable Image File Format; \
metadata from images) information stored in headers of JPEG and TIFF \
images."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-exif-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "8e9bc23d86ec60b67742bae8efb4c25ffd4989ca9d81bb5b8c016b57b80b32012279ee55bde8f6608f4d97edaa3e0bf9d6e8bf8c27229398ae1ebaa1ed4d02f8"

RPROVIDES:${PN} += "config-php8-exif \
php-exif \
php8-exif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-mbstring"

inherit rpm

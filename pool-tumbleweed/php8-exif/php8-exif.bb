SUMMARY = "EXIF metadata extensions for PHP"
DESCRIPTION = "PHP functions for extracting EXIF (Exchangable Image File Format; \
metadata from images) information stored in headers of JPEG and TIFF \
images."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-exif-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "f17fe4efe45897790fb6cb0fc4126828665802d23998a39d532fda0db18f8bc22adf489ee4ef7683edbd5605dc655d4748471f2cec30cad43bf4fa35b1eae511"

RPROVIDES:${PN} += "config-php8-exif \
php-exif \
php8-exif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-mbstring"

inherit rpm

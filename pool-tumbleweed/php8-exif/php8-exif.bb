SUMMARY = "EXIF metadata extensions for PHP"
DESCRIPTION = "PHP functions for extracting EXIF (Exchangable Image File Format; \
metadata from images) information stored in headers of JPEG and TIFF \
images."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-exif-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "d1eda9608cd10ade73b897ed1489a51ce630e371a8e5cc85dfa57b129053e41796e51022eb5ad5bac5a31cbed478ac7cad8044e491230d41f949e9dd3a50f4c5"

RPROVIDES:${PN} += "config-php8-exif \
php-exif \
php8-exif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-mbstring"

inherit rpm

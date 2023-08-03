SUMMARY = "EXIF metadata extensions for PHP"
DESCRIPTION = "PHP functions for extracting EXIF (Exchangable Image File Format; \
metadata from images) information stored in headers of JPEG and TIFF \
images."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-exif-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "a0bb876c80ef6721ac0930a12eaaa199d82dfa1e81c48b04a93471177acbd0232966d011339e734029bd31b13e7615943638ccd4f61e8f173a353ceb74826fe8"

RPROVIDES:${PN} += "config-php8-exif \
php-exif \
php8-exif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-mbstring"

inherit rpm

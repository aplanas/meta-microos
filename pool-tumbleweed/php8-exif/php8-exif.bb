SUMMARY = "EXIF metadata extensions for PHP"
DESCRIPTION = "PHP functions for extracting EXIF (Exchangable Image File Format; \
metadata from images) information stored in headers of JPEG and TIFF \
images."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-exif-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "cdf9b42f2ac2dfecaa8cfb771f61238038e36789c3e4b021447874444de4b9fee196677ede965a29b7a3b8ebee6c3d303bd4051b59f3cef729ef8cb42db92007"

RPROVIDES:${PN} += "config-php8-exif \
php-exif \
php8-exif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-mbstring"

inherit rpm

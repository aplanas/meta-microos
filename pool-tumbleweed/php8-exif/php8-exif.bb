SUMMARY = "EXIF metadata extensions for PHP"
DESCRIPTION = "PHP functions for extracting EXIF (Exchangable Image File Format; \
metadata from images) information stored in headers of JPEG and TIFF \
images."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-exif-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "dd42e68c7ff18e434412439d1967d14727431c596334626fd49c16ba615dbf591fa9eb12ae666db549cdd979270f25d19a19ee3382a1fe280f1483146952fb6a"

RPROVIDES:${PN} += "config(php8-exif) \
php-exif \
php8-exif \
php8-exif(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
php \
php-mbstring"

inherit rpm

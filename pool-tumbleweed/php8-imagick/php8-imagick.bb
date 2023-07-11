SUMMARY = "Wrapper to the ImageMagick library"
DESCRIPTION = "PHP extension to create, modify and obtain meta information of images using \
the ImageMagick API."
LICENSE = "PHP-3.01"

PV = "3.7.0"

RPM_NAME = "php8-imagick-3.7.0-2.6.aarch64.rpm"
RPM_HASH = "af727df7fa59f6f41b6c8265231d4b2e81e105a7503ad7f341c0b5ef5a668ef0c3f4ebb15843618b99c690fba82cc32e3484155893574b721f0085da5974e6d0"

RPROVIDES:${PN} += "config-php8-imagick \
php-imagick \
php8-imagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libgomp.so.1 \
php-api \
php-zend-abi"

inherit rpm

SUMMARY = "Wrapper to the GraphicsMagick library"
DESCRIPTION = "PHP extension to create, modify and obtain meta information of images using \
the GraphicsMagick API"
LICENSE = "PHP-3.01"

PV = "2.0.6RC1"

RPM_NAME = "php8-gmagick-2.0.6RC1-3.5.aarch64.rpm"
RPM_HASH = "225cfb4ad04631876d968139c9fd0dd726eaf843b73d2fa6b932d795152f6d00d84e9f24aa527cc154e44b906bfdbec98a7d056db7341c3655e26cb7e037d7d9"

RPROVIDES:${PN} += "config-php8-gmagick \
php-gmagick \
php8-gmagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libGraphicsMagickWand-Q16.so.2 \
libc.so.6 \
libgomp.so.1 \
php-api \
php-zend-abi"

inherit rpm

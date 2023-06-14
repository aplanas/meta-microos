SUMMARY = "Wrapper to the ImageMagick library"
DESCRIPTION = "PHP extension to create, modify and obtain meta information of images using \
the ImageMagick API."
LICENSE = "PHP-3.01"

PV = "3.7.0"

RPM_NAME = "php8-imagick-3.7.0-2.5.aarch64.rpm"
RPM_HASH = "59ba5c7086eb35bb60c23e224bf7a982454fc77746a9095ffd7abdbbea28ddbf15f0e1293827e2c1c80509e78c690da723593ee88173bfaaeaa0c4ccdb12227e"

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

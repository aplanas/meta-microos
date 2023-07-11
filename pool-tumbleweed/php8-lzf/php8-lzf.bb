SUMMARY = "LZF compression"
DESCRIPTION = "This package handles LZF de/compression."
LICENSE = "PHP-3.01"

PV = "1.7.0"

RPM_NAME = "php8-lzf-1.7.0-2.6.aarch64.rpm"
RPM_HASH = "37b0597ea9d34810c5327b3d12e842136582b866be431a193813c31c3eaba7deb60f4d19d39a16628245e77ba6b600de7c6030f199eb12fd80fb0b50f702a170"

RPROVIDES:${PN} += "config-php8-lzf \
php-lzf \
php8-lzf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php-api \
php-zend-abi"

inherit rpm

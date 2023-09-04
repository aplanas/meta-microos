SUMMARY = "GD Graphics Library extension for PHP"
DESCRIPTION = "PHP functions to create and manipulate image files in a variety of \
different image formats, including GIF, PNG, JPEG, WBMP, and XPM. Even \
more convenient: PHP can output image streams directly to a browser."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-gd-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "3bee838ae13a517ceff8d4c01ec3016a5dbc26441779d1a411142c57083294f614af402cae50e31526b2c42b447f44091e5c4e63db71bf32e2a17524ef4387b9"

RPROVIDES:${PN} += "config-php8-gd \
php-gd \
php8-gd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
php"

inherit rpm

SUMMARY = "GD Graphics Library extension for PHP"
DESCRIPTION = "PHP functions to create and manipulate image files in a variety of \
different image formats, including GIF, PNG, JPEG, WBMP, and XPM. Even \
more convenient: PHP can output image streams directly to a browser."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-gd-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "9db38ed12e3fed512410fce0ff7439a5bcb3b02df1533a1338c08380224f1ded824d1ab88fd523d7ea0312abfa33d6511edcdd5ff70d1e9ba8c5890a5a680490"

RPROVIDES:${PN} += "config-php8-gd \
php-gd \
php8-gd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
php"

inherit rpm

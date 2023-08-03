SUMMARY = "GD Graphics Library extension for PHP"
DESCRIPTION = "PHP functions to create and manipulate image files in a variety of \
different image formats, including GIF, PNG, JPEG, WBMP, and XPM. Even \
more convenient: PHP can output image streams directly to a browser."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-gd-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "5a0e055b48cc90e2e881a37bb9a38f11c6479665903418071b81b995c4bc8150cb37199fc3d374f83e0ecf8db739bc6daa0200a8472576479724ead033683aaa"

RPROVIDES:${PN} += "config-php8-gd \
php-gd \
php8-gd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
php"

inherit rpm

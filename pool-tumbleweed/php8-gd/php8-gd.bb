SUMMARY = "GD Graphics Library extension for PHP"
DESCRIPTION = "PHP functions to create and manipulate image files in a variety of \
different image formats, including GIF, PNG, JPEG, WBMP, and XPM. Even \
more convenient: PHP can output image streams directly to a browser."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-gd-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "68171c5ce2bc1baf88ca854d2ef9a7e2ea5f46f8999ca58d88445f6f28ceffdc440560e889526aa27cb8368a561360f31c9f4ebdd0e8aa7109b03f7d03476768"

RPROVIDES:${PN} += "config(php8-gd) \
php-gd \
php8-gd \
php8-gd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgd.so.3()(64bit) \
php"

inherit rpm

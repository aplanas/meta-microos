SUMMARY = "GD Graphics Library extension for PHP"
DESCRIPTION = "PHP functions to create and manipulate image files in a variety of \
different image formats, including GIF, PNG, JPEG, WBMP, and XPM. Even \
more convenient: PHP can output image streams directly to a browser."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-gd-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "0e229b7628ba058bddb103757011421ba5ba129649d11b4c08a24eb5e553a3bb29d67f4e7dd44c678bf71be072b40cb6c5854fbc3a5a9c653deece9c4ea5b217"

RPROVIDES:${PN} += "config-php8-gd \
php-gd \
php8-gd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
php"

inherit rpm

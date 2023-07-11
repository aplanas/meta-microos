SUMMARY = "GD Graphics Library extension for PHP"
DESCRIPTION = "PHP functions to create and manipulate image files in a variety of \
different image formats, including GIF, PNG, JPEG, WBMP, and XPM. Even \
more convenient: PHP can output image streams directly to a browser."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-gd-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "b3eb9617121cc1ac63533d7d49371d8763651a2754b4e19fe35911b8fff8d2a988787af0c663284eadb5ded66aca252d2098c5557ffd0d9d562288b5e6610f44"

RPROVIDES:${PN} += "config-php8-gd \
php-gd \
php8-gd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
php"

inherit rpm

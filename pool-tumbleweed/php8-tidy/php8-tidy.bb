SUMMARY = "PHP binding for the Tidy HTML cleaner"
DESCRIPTION = "Tidy is an extension based on Libtidy (http://tidy.sourceforge.net) and allows \
a PHP developer to clean, repair, and traverse HTML, XHTML, and XML \
documents -- including ones with embedded scripting languages such as \
PHP or ASP within them using OO constructs."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-tidy-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "4c9a5161f29e70e88e8f99f8451a7642bd22c352703ba4f6095cdaa8e8f5b8fd506b9d8cec8193b4d4aea6d257aaaf6f8bb5a1897298432bfda3ef9995cb2804"

RPROVIDES:${PN} += "config-php8-tidy \
php-tidy \
php8-tidy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtidy.so.58 \
php"

inherit rpm

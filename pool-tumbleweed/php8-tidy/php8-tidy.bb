SUMMARY = "PHP binding for the Tidy HTML cleaner"
DESCRIPTION = "Tidy is an extension based on Libtidy (http://tidy.sourceforge.net) and allows \
a PHP developer to clean, repair, and traverse HTML, XHTML, and XML \
documents -- including ones with embedded scripting languages such as \
PHP or ASP within them using OO constructs."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-tidy-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "e5c193c21d2f2f187c84fd1e5b79896c643eb5c7c2eb466d578918f6082c845da960e5a75d81b8d025993b27c8c4ee71ecb98a494c9363b623a21053d60f0439"

RPROVIDES:${PN} += "config-php8-tidy \
php-tidy \
php8-tidy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtidy.so.58 \
php"

inherit rpm

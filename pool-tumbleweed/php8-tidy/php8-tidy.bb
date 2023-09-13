SUMMARY = "PHP binding for the Tidy HTML cleaner"
DESCRIPTION = "Tidy is an extension based on Libtidy (http://tidy.sourceforge.net) and allows \
a PHP developer to clean, repair, and traverse HTML, XHTML, and XML \
documents -- including ones with embedded scripting languages such as \
PHP or ASP within them using OO constructs."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-tidy-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "bfc9afa1612aa466826c725717020737feb2dc9a989cb9d496c2d406bb6ebdf1c15e734366bd1379711fa81e2f5c076232740fbbeb884e2e80bfebb31a5b5326"

RPROVIDES:${PN} += "config-php8-tidy \
php-tidy \
php8-tidy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtidy.so.58 \
php"

inherit rpm

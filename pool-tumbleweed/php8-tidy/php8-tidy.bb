SUMMARY = "PHP binding for the Tidy HTML cleaner"
DESCRIPTION = "Tidy is an extension based on Libtidy (http://tidy.sourceforge.net) and allows \
a PHP developer to clean, repair, and traverse HTML, XHTML, and XML \
documents -- including ones with embedded scripting languages such as \
PHP or ASP within them using OO constructs."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-tidy-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "38a978b21aa5f33018e576d38c80a25e3b97102b8f18eaf2f616eb1b2a36e14502ba6cee63ec717ae488397d8716a29ac891ae864a91c225e2abb57365afe2d4"

RPROVIDES:${PN} += "config-php8-tidy \
php-tidy \
php8-tidy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtidy.so.58 \
php"

inherit rpm

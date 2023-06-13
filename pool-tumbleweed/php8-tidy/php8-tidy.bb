SUMMARY = "PHP binding for the Tidy HTML cleaner"
DESCRIPTION = "Tidy is an extension based on Libtidy (http://tidy.sourceforge.net) and allows \
a PHP developer to clean, repair, and traverse HTML, XHTML, and XML \
documents -- including ones with embedded scripting languages such as \
PHP or ASP within them using OO constructs."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-tidy-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "7b16b27c6f9cd54e905fa36449d1d7f5853f250f53d9ef8209f2f0ed7a2cbb33b96f5b386bf13f2a5b47f38f1e4c0d820d5ef201b7c9af46bf8cd8e9d5b36634"

RPROVIDES:${PN} += "config(php8-tidy) \
php-tidy \
php8-tidy \
php8-tidy(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libtidy.so.58()(64bit) \
php"

inherit rpm

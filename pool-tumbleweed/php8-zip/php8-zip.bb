SUMMARY = "ZIP archive support for PHP"
DESCRIPTION = "This extension allows to transparently read or write ZIP compressed \
archives and the files inside them."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-zip-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "fbbabfab400090cf4034e38887ce0bb0ea2529d35c1adc5a399063e98f8fca0ff4e79ee4f3b34685809a2f85f33648f1f7486052a1f7b5c26fffa8dd44026342"

RPROVIDES:${PN} += "config-php8-zip \
php-zip \
php8-zip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzip.so.5 \
php"

inherit rpm

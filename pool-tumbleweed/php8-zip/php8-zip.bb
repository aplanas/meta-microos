SUMMARY = "ZIP archive support for PHP"
DESCRIPTION = "This extension allows to transparently read or write ZIP compressed \
archives and the files inside them."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-zip-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "7050010ae93e33bee5e5a54a6aa530fd3952fd925d2e288ef9f03077b0e8bbc9bf5966cc240ae4c6cb8cedd59e80c2f74b83f45db15aec95ded7cf74fb54e13b"

RPROVIDES:${PN} += "config-php8-zip \
php-zip \
php8-zip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzip.so.5 \
php"

inherit rpm

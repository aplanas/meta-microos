SUMMARY = "ZIP archive support for PHP"
DESCRIPTION = "This extension allows to transparently read or write ZIP compressed \
archives and the files inside them."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-zip-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "006634e8d594a3048115f19697b948532576b0d6ccdc3a8acf0ae9577bbb56af698880e391a2afee6be3265cdd6ecb8e070cb3d5f64828eefa29be07c4c25267"

RPROVIDES:${PN} += "config-php8-zip \
php-zip \
php8-zip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzip.so.5 \
php"

inherit rpm

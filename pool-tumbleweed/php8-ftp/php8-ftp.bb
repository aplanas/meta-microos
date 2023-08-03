SUMMARY = "FTP protocol support for PHP"
DESCRIPTION = "PHP functions for access to file servers speaking the File Transfer \
Protocol (FTP) as defined in RFC 959."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-ftp-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "fd5dd1b972bbcb648d59b6eaf10aa93cb0bcb169bc9c2e1cd116d98ee9cbf6c7232cafae38c124dc44fa08f0f55b113dfa0785ac372f75dfb07c6ebfeee22792"

RPROVIDES:${PN} += "config-php8-ftp \
php-ftp \
php8-ftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm

SUMMARY = "FTP protocol support for PHP"
DESCRIPTION = "PHP functions for access to file servers speaking the File Transfer \
Protocol (FTP) as defined in RFC 959."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-ftp-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "0c226c5c48edeab1a4a3e69daaae9a9c3aeb959366487012065dcc0ee19b282bffedb757bdba11bbf4e0c84944e644043ea3a6af2162b85f0170541af079684a"

RPROVIDES:${PN} += "config-php8-ftp \
php-ftp \
php8-ftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm

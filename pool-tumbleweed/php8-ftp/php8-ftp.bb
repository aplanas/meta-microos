SUMMARY = "FTP protocol support for PHP"
DESCRIPTION = "PHP functions for access to file servers speaking the File Transfer \
Protocol (FTP) as defined in RFC 959."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-ftp-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "b9d7ba56859e8b4ffe3253b5facd2dce2e333b1f61bda85ef6cd5d53c1f849a6cb8c2d3c211c04f8b6dca9f47865c32d8da0c700f981ad1039ea34abf607d356"

RPROVIDES:${PN} += "config-php8-ftp \
php-ftp \
php8-ftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm

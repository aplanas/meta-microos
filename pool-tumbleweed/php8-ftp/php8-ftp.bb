SUMMARY = "FTP protocol support for PHP"
DESCRIPTION = "PHP functions for access to file servers speaking the File Transfer \
Protocol (FTP) as defined in RFC 959."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-ftp-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "33cafbec484d4f3f5829630c1ca99c9eafe7f5a2206c98d25e6ad0dd4eb07d3ace1501c5d82cde03aacf27ccdd87da87210290f8bdebb604ccdaf42ef6252367"

RPROVIDES:${PN} += "config-php8-ftp \
php-ftp \
php8-ftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm

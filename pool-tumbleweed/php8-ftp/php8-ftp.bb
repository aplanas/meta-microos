SUMMARY = "FTP protocol support for PHP"
DESCRIPTION = "PHP functions for access to file servers speaking the File Transfer \
Protocol (FTP) as defined in RFC 959."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-ftp-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "0df403c479920ec189e3aefc6092d64c7ad39b94b2bbdb372b1743bcc60a38cbfd3c144584141a4b294fb0417addb0921682063684bd9ce65dc95ee1f99b3626"

RPROVIDES:${PN} += "config-php8-ftp \
php-ftp \
php8-ftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm

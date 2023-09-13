SUMMARY = "FTP protocol support for PHP"
DESCRIPTION = "PHP functions for access to file servers speaking the File Transfer \
Protocol (FTP) as defined in RFC 959."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-ftp-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "4f36b00122dd532403af44369a0420cb725668a7a34042afa5cf603f6fb135ed20962abff2dc4e1a40df523f938a3c07b4006b37252e8fa3d3d33b0ed62956cf"

RPROVIDES:${PN} += "config-php8-ftp \
php-ftp \
php8-ftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm

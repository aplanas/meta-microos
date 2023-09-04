SUMMARY = "Character set conversion functions for PHP"
DESCRIPTION = "This module contains an interface to iconv character set conversion \
facility. With this module, a string represented by a local character \
set can be turned into another character set, which may be the \
Unicode character set. Supported character sets depend on the iconv \
implementation of your system."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-iconv-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "1fcaece02c33cce01bebbf9c429b4d2870d5f53c140ec2541f703d66ab55bf74d0cdb5b3d798115c1e09aec304b2238705165d2fcd9accb343f41b23c950ab76"

RPROVIDES:${PN} += "config-php8-iconv \
php-iconv \
php8-iconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

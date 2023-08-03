SUMMARY = "PHP libcurl integration"
DESCRIPTION = "PHP interface to libcurl that allows you to connect to and communicate \
with servers of many different types, using protocols of many different \
types."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-curl-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "38134a2652812f9f21ac7fc8bdae222e42f2ffc2d6bac89f4227033d2c36d3f0f361c29e1954785ae5f98efdee1d8758f6759f6bf6e6f3075db6636b17f66989"

RPROVIDES:${PN} += "config-php8-curl \
php-curl \
php8-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
php"

inherit rpm

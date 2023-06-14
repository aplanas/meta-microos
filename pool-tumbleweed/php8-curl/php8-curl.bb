SUMMARY = "PHP libcurl integration"
DESCRIPTION = "PHP interface to libcurl that allows you to connect to and communicate \
with servers of many different types, using protocols of many different \
types."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-curl-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "9c641ecc309f35203cfcb90b255da6770273f0638ff31a8104c1ee906342b6dee5df3c09fa8faacef53f93fa5166695eefccf5d26bfe0a0b909290ecf8b2bf73"

RPROVIDES:${PN} += "config-php8-curl \
php-curl \
php8-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
php"

inherit rpm

SUMMARY = "PHP libcurl integration"
DESCRIPTION = "PHP interface to libcurl that allows you to connect to and communicate \
with servers of many different types, using protocols of many different \
types."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-curl-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "e281c60c1a3db3df2c0e7bf0b388cbd88a00a4847e4bf8aee424609178d6d79b828ec593f0cde948aef8fd51d60c5c5993da5512222a54570323c9333eeaf26d"

RPROVIDES:${PN} += "config-php8-curl \
php-curl \
php8-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
php"

inherit rpm

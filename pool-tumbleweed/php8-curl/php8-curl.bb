SUMMARY = "PHP libcurl integration"
DESCRIPTION = "PHP interface to libcurl that allows you to connect to and communicate \
with servers of many different types, using protocols of many different \
types."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-curl-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "0b0913b25889ddb47abe47fb0dec759032be4df931f95757d661037f83f13602b73324942748eb9f15001768e264b9b36be352b01e49ab44052db37623efea4f"

RPROVIDES:${PN} += "config-php8-curl \
php-curl \
php8-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
php"

inherit rpm

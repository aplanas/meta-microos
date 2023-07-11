SUMMARY = "PHP libcurl integration"
DESCRIPTION = "PHP interface to libcurl that allows you to connect to and communicate \
with servers of many different types, using protocols of many different \
types."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-curl-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "22291fd4371708295eac2d90914989740efdda1a35943788e1eec6c7ef02531ced0b16bd3979200f2fe5886e3d5249a2f9ad4ffc7b91f2e02077266a1a20c1f6"

RPROVIDES:${PN} += "config-php8-curl \
php-curl \
php8-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
php"

inherit rpm

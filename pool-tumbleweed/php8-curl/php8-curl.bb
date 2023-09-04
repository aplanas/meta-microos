SUMMARY = "PHP libcurl integration"
DESCRIPTION = "PHP interface to libcurl that allows you to connect to and communicate \
with servers of many different types, using protocols of many different \
types."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-curl-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "a2f4796325edd7ccd08ec31325143467bbe5f90eaa54bb0b0e324f073a299488f76187d2542da5c38ff12d860fbcc40a09e36ee00130c367086e48a0d9961320"

RPROVIDES:${PN} += "config-php8-curl \
php-curl \
php8-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
php"

inherit rpm

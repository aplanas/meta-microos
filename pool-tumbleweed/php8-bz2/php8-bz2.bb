SUMMARY = "PHP bzip2 codec support"
DESCRIPTION = "PHP functions to read and write bzip2 (.bz2) compressed files."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-bz2-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "95a357cc127bbb585ee278cfdd6b7d33555a5fa3ed11dd03d83c4a382a1219054e3045ed57f19a64bcf2bf836e22cf8ac975e984ed88de4b840245cb45d077a3"

RPROVIDES:${PN} += "config-php8-bz2 \
php-bz2 \
php8-bz2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
php"

inherit rpm

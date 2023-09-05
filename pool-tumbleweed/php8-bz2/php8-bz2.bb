SUMMARY = "PHP bzip2 codec support"
DESCRIPTION = "PHP functions to read and write bzip2 (.bz2) compressed files."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-bz2-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "14be90eaf17f46803e70c77bb7b17d6ff1f58f996e13f7fde040bbfed724811d0d0aa6f75198a240a30c8351a62e5a82a12cf533319baa31f451e9e9ac456531"

RPROVIDES:${PN} += "config-php8-bz2 \
php-bz2 \
php8-bz2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
php"

inherit rpm

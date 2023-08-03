SUMMARY = "PHP bzip2 codec support"
DESCRIPTION = "PHP functions to read and write bzip2 (.bz2) compressed files."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-bz2-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "a7c38b63540c0bbab47a68b9544fddb7b86b6c85ef0b1774b3ae4cac73840c33a9719ad198a2a28283b673415ebeafd7d6df2a21eb85e26f825fdb4b33f3fe8f"

RPROVIDES:${PN} += "config-php8-bz2 \
php-bz2 \
php8-bz2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
php"

inherit rpm

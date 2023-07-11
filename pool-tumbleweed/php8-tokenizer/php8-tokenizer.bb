SUMMARY = "Extension module to access Zend Engine's PHP tokenizer"
DESCRIPTION = "The tokenizer functions provide an interface to the PHP tokenizer \
embedded in the Zend Engine. Using these functions you may write your \
own PHP source analyzing or modification tools without having to deal \
with the language specification at the lexical level."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-tokenizer-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "b913a028b873a1e78ef6693a6467178063dfb5f63d22070e0e62cf3525124cb1f88ebb6f9c3454923b4fef6240fa20718868df2a577f0c17e6be0b4778db47c1"

RPROVIDES:${PN} += "config-php8-tokenizer \
php-tokenizer \
php8-tokenizer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

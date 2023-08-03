SUMMARY = "Extension module to access Zend Engine's PHP tokenizer"
DESCRIPTION = "The tokenizer functions provide an interface to the PHP tokenizer \
embedded in the Zend Engine. Using these functions you may write your \
own PHP source analyzing or modification tools without having to deal \
with the language specification at the lexical level."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-tokenizer-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "b644430bc363786fea918837887aa02ffc7a176698b4a3c4c82aae4a59ab1a20db6d0558f7d7b734e3f55ed9938c559e326e88db6eaf083ae812b70c35224bab"

RPROVIDES:${PN} += "config-php8-tokenizer \
php-tokenizer \
php8-tokenizer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

SUMMARY = "Extension module to access Zend Engine's PHP tokenizer"
DESCRIPTION = "The tokenizer functions provide an interface to the PHP tokenizer \
embedded in the Zend Engine. Using these functions you may write your \
own PHP source analyzing or modification tools without having to deal \
with the language specification at the lexical level."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-tokenizer-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "b9775b71551fd3509eed1b910f5b90e4ea38e6b3cacd428309741bbc0fb3d6504ea8f65a129b1b9aeddf8a2e09f7c903f750622528d5ccb91812fe3d07ab6213"

RPROVIDES:${PN} += "config-php8-tokenizer \
php-tokenizer \
php8-tokenizer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

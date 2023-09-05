SUMMARY = "Extension module to access Zend Engine's PHP tokenizer"
DESCRIPTION = "The tokenizer functions provide an interface to the PHP tokenizer \
embedded in the Zend Engine. Using these functions you may write your \
own PHP source analyzing or modification tools without having to deal \
with the language specification at the lexical level."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-tokenizer-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "07f7713918578eba3cea1c9ce8118b11d45e026018538c1e121f71c0a2cc743e84530bfface450a77cfb36b85d173ea3c8485aa1c641a0b9dcfb4dc7560a726d"

RPROVIDES:${PN} += "config-php8-tokenizer \
php-tokenizer \
php8-tokenizer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

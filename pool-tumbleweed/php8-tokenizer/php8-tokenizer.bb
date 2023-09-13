SUMMARY = "Extension module to access Zend Engine's PHP tokenizer"
DESCRIPTION = "The tokenizer functions provide an interface to the PHP tokenizer \
embedded in the Zend Engine. Using these functions you may write your \
own PHP source analyzing or modification tools without having to deal \
with the language specification at the lexical level."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-tokenizer-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "0a16773db4b3219bc67a532802c5397da68de38d58704020d9d7b60fce5f5918b37c7014935631e843f0121ff0d8603c507b2c39ed58c1bdf58aa867c7e59c58"

RPROVIDES:${PN} += "config-php8-tokenizer \
php-tokenizer \
php8-tokenizer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm

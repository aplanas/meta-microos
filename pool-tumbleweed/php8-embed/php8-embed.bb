SUMMARY = "Embedded SAPI Library"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-embed-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "82d294cfc399073ecc79e9569c9526291d32bfb36c5a616d078dc5909c00761fe64a7e3bd1d45e127bf388f480f989751616186f51a62f02dc93c83135957c4b"

RPROVIDES:${PN} += "libphp.so \
php-sapi \
php8-embed"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libxml2.so.2 \
php"

inherit rpm

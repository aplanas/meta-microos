SUMMARY = "Embedded SAPI Library"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-embed-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "23da76c429955d08a0c00eb6e2e00b5cbcf30371fa924c444e1ed03d3ef86b97bf23dd693da3dbd20ca9ffff976ddf7bcd9645fecc04e4634e88027c69f03d8e"

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

SUMMARY = "Embedded SAPI Library"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-embed-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "71a5821307397481e53561de4ec492dfa4140d4fb72e7a834a6d2aef5411cdc721faff4fd03d5caca5ed423c99932d7e20f0dadefe9c2128bb74a3049e0743dc"

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

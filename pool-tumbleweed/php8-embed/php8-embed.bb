SUMMARY = "Embedded SAPI Library"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-embed-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "90f6b2ff1e41e7115a240a293ae1dc2b672feda33dbb6b08790e36e501b9bdbf886afcdfeabfdd27ddcdf51820b11ad86d744f881cc7b076182634c6206539d7"

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

SUMMARY = "FastCGI Process Manager PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-fpm-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "aa8b372f2823f42857994b0882527e345d394820bf6dd0d3ef111019849e05fb2c036d18192844033a9b9cfa893d87b22110d658cd4d7c067c87afdf21c27449"

RPROVIDES:${PN} += "config-php8-fpm \
php-fpm \
php-sapi \
php8-fpm"

RDEPENDS:${PN} += "/usr/bin/sh \
group-www \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libapparmor.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libsystemd.so.0 \
libxml2.so.2 \
php \
user-wwwrun"

inherit rpm

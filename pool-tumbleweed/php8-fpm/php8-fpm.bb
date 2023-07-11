SUMMARY = "FastCGI Process Manager PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-fpm-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "995cc484c0cc7f67a6d7f34ed2f5276697e0031fc85730913c9bfee93ea0c0018e68728cf4d825f0353e895f9155e116bc828c506fb07501d82f46d94884fd32"

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

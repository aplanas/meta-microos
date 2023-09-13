SUMMARY = "FastCGI Process Manager PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-fpm-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "45ae733ca918548c1c413418fe5055706075aca321da45b4fe1b54d5fac53d24c0feaebfe2dc5a83eede61a5fb8ba0a12cfebf6226181ca7c1ca9659db34bb19"

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

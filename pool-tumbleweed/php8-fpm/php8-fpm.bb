SUMMARY = "FastCGI Process Manager PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-fpm-8.1.19-2.1.aarch64.rpm"
RPM_HASH = "9b2970231ae7848b9a5bedd31b86b15cf309102869a4cf0c910c518539f2febc4043ba51852605dd6e53b814af5f5eec1c4bbcd2800c123a49dc593a06fd3ff4"

RPROVIDES:${PN} += "config-php8-fpm \
php-fpm \
php-sapi \
php8-fpm"

RDEPENDS:${PN} += "/bin/sh \
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

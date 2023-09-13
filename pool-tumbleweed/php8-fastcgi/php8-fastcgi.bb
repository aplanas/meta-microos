SUMMARY = "FastCGI PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-fastcgi-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "2905c1aeb5a5bc732b57271b09eb8f7dafd5baf28eed370a4ddb30f9e323c028482a5c5789c8822d4234601d81258420c2e14fdf938c5ee60e794a9fd153a10c"

RPROVIDES:${PN} += "config-php8-fastcgi \
php-cgi \
php-fastcgi \
php-sapi \
php8-fastcgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libxml2.so.2 \
php"

inherit rpm

SUMMARY = "FastCGI PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-fastcgi-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "611d1c60749bac493e2a46b27f67ce811634094b6adda5c9dc034bc633c9b667718e1422aa382f5265cb2d80687427cf3af374efd919731fab7abb181c56dea6"

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

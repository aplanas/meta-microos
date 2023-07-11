SUMMARY = "FastCGI PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-fastcgi-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "346ceecb8d25bd3a851e15ebcf293f7a3b96dd151c45ced81aa3d1a0676613fa1dcdde368d5d0ffc477cf12b3ae8f269e6d361b3d84fcf54e8ae7be3d9af889d"

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

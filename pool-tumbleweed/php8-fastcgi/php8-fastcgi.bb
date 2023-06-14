SUMMARY = "FastCGI PHP Module"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-fastcgi-8.1.19-2.1.aarch64.rpm"
RPM_HASH = "19179aae2e691642025efeda55063f96ec87ec3b3e1acb32be8be8da7d4fa69e99c33122fb3d8f838b1f76458d81258183d68756111347506a2c84a4aa29f209"

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

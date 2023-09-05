SUMMARY = "PHP module for the Apache 2.x webserver"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that, have a look at the example archive sites and some of the other \
resources available in the links section. \
 \
Please refer to /usr/share/doc/packages/php8/README.SUSE for \
information on how to load the module into the Apache webserver."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "apache2-mod_php8-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "2a640cf8796cd725a793e98ac517c90417e745beee3ed0811fa10eefd9db8f5a4af2af14a495bb5c6523a7e705ece1d64463129cb0114219eef5d238a702ff0a"

RPROVIDES:${PN} += "apache2-mod-php8 \
config-apache2-mod-php8 \
mod-php-any \
php-sapi"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/a2enmod \
apache-mmn-20120211 \
apache2-prefork \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libxml2.so.2 \
php"

inherit rpm

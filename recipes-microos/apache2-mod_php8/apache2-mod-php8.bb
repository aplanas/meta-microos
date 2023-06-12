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

PV = "8.1.19"

RPM_NAME = "apache2-mod_php8-8.1.19-2.1.aarch64.rpm"
RPM_HASH = "2cd365ba851ab15494771c064287d88097611019b92669fe60128be10477d634e3ef249d066b020aae0f1950d2ac4b64c65d5f96bead06b311d218e2042cf666"

RPROVIDES:${PN} += "apache2-mod_php8 apache2-mod_php8(aarch-64) config(apache2-mod_php8) mod_php_any php-sapi"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/a2enmod apache2-prefork apache_mmn_20120211 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libargon2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpcre2-8.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.11)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) php"

inherit rpm

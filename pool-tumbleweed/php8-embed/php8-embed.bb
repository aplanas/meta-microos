SUMMARY = "Embedded SAPI Library"
DESCRIPTION = "PHP is a server-side, cross-platform HTML embedded scripting language. \
If you are completely new to PHP and want to get some idea of how it \
works, have a look at the Introductory tutorial. Once you get beyond \
that have a look at the example archive sites and some of the other \
resources available in the links section."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-embed-8.1.19-2.1.aarch64.rpm"
RPM_HASH = "975a9757546dfd6bc668e8f902d8ba3da482bdc20d128e1af3f5828ebda2c50e4810a3f5cf2f5f87103b6d9a2855f23b27457f831918f9a10c4d894c7277aea4"

RPROVIDES:${PN} += "libphp.so()(64bit) \
php-sapi \
php8-embed \
php8-embed(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libargon2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libm.so.6()(64bit) \
libpcre2-8.so.0()(64bit) \
libxml2.so.2()(64bit) \
php"

inherit rpm

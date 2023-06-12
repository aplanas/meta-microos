SUMMARY = "SOAP/WSDL extension module for PHP"
DESCRIPTION = "This module provides SOAP support. \
 \
SOAP extension can be used to write SOAP Servers and Clients. It \
supports subsets of SOAP 1.1, SOAP 1.2 and WSDL 1.1 specifications."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-soap-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "3ee45cd9d999d94430b691c9ef1475f85883ef728268969bc98163b2c313ac225f7ceff1f53f72c424ccd5e60da5f4aae024be73edfdac9ab44855a2266adcda"

RPROVIDES:${PN} += "config(php8-soap) \
php-soap \
php8-soap \
php8-soap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
php"

inherit rpm
SUMMARY = "SOAP/WSDL extension module for PHP"
DESCRIPTION = "This module provides SOAP support. \
 \
SOAP extension can be used to write SOAP Servers and Clients. It \
supports subsets of SOAP 1.1, SOAP 1.2 and WSDL 1.1 specifications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-soap-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "a034524319d5bf584071894d58d91fc14422a34dd2d94ae1605af5751c878d29f7c54fa3dc73a5343a4e42afa31f9807feec8c4070c8b85b96cbc3a6201e83e4"

RPROVIDES:${PN} += "config-php8-soap \
php-soap \
php8-soap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm

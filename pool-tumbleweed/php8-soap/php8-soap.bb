SUMMARY = "SOAP/WSDL extension module for PHP"
DESCRIPTION = "This module provides SOAP support. \
 \
SOAP extension can be used to write SOAP Servers and Clients. It \
supports subsets of SOAP 1.1, SOAP 1.2 and WSDL 1.1 specifications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-soap-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "f48f9baa11b6e812681f9b8133057637e735d4f358019f87aa6488cde6731e48598be8f5662f681ecedf163e64b9a9206d0cb1a3489a5322ffaa761ffcabded0"

RPROVIDES:${PN} += "config-php8-soap \
php-soap \
php8-soap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm

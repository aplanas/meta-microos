SUMMARY = "SOAP/WSDL extension module for PHP"
DESCRIPTION = "This module provides SOAP support. \
 \
SOAP extension can be used to write SOAP Servers and Clients. It \
supports subsets of SOAP 1.1, SOAP 1.2 and WSDL 1.1 specifications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-soap-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "3cf06fd257653470927e220e0dd7d7b130749944d6f684362922a2d5ee3fc90a67d4237fea2fe0199cdbfede15131a4c5a55eb6fb3b3ca948e427ace2d1c8cd5"

RPROVIDES:${PN} += "config-php8-soap \
php-soap \
php8-soap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm

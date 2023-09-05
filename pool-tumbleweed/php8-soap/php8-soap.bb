SUMMARY = "SOAP/WSDL extension module for PHP"
DESCRIPTION = "This module provides SOAP support. \
 \
SOAP extension can be used to write SOAP Servers and Clients. It \
supports subsets of SOAP 1.1, SOAP 1.2 and WSDL 1.1 specifications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-soap-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "1d9c153bb2de9db9095e486ad43cc72c4c329ff2f74113ef8579e2e1a565455180ab13d6cae1c12c3a67dfdb356384f19dbb005d5786ffc4afb43b3e15f17573"

RPROVIDES:${PN} += "config-php8-soap \
php-soap \
php8-soap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm

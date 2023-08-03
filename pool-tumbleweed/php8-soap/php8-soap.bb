SUMMARY = "SOAP/WSDL extension module for PHP"
DESCRIPTION = "This module provides SOAP support. \
 \
SOAP extension can be used to write SOAP Servers and Clients. It \
supports subsets of SOAP 1.1, SOAP 1.2 and WSDL 1.1 specifications."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-soap-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "6f4c0629a5dad72c10b0612197f1d2f63ce85b4f13e55ab92e2a37b6d8cde55a4a63162ed867dcb74be4118e1e8151e05d6c6ef6fbfcb4a39ea3dc35c5c52540"

RPROVIDES:${PN} += "config-php8-soap \
php-soap \
php8-soap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
php"

inherit rpm

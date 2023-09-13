SUMMARY = "SNMP extension for PHP"
DESCRIPTION = "The SNMP extension provides a toolset for managing remote devices via \
the Simple Network Management Protocol. \
 \
As it is a wrapper around the underlying Net-SNMP library, all basic \
concepts are the same and the PHP functions change their behavior \
depending on the Net-SNMP configuration files and environment \
variables."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-snmp-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "97468b8853a83b360bdc76f588ce537d4938155214a31e63b77f2fb820f5206291a674252da8ccf2592c7cde4031dceadc4e6d118ac4083a5739cb96fc55d3fd"

RPROVIDES:${PN} += "config-php8-snmp \
php-snmp \
php8-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
php"

inherit rpm

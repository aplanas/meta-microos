SUMMARY = "SNMP extension for PHP"
DESCRIPTION = "The SNMP extension provides a toolset for managing remote devices via \
the Simple Network Management Protocol. \
 \
As it is a wrapper around the underlying Net-SNMP library, all basic \
concepts are the same and the PHP functions change their behavior \
depending on the Net-SNMP configuration files and environment \
variables."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-snmp-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "411f3065a49e3dfdadb1f78c5fdb9f4761121f260999369696c859d17f5bd28d8306297ff43730a74ab7ad999c8873cf2e2b470d62ee2d8a993a3e610ec0cefc"

RPROVIDES:${PN} += "config-php8-snmp \
php-snmp \
php8-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
php"

inherit rpm

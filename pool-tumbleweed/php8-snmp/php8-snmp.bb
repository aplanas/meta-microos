SUMMARY = "SNMP extension for PHP"
DESCRIPTION = "The SNMP extension provides a toolset for managing remote devices via \
the Simple Network Management Protocol. \
 \
As it is a wrapper around the underlying Net-SNMP library, all basic \
concepts are the same and the PHP functions change their behavior \
depending on the Net-SNMP configuration files and environment \
variables."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-snmp-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "53225954b62ab79606b609243dc88046c4c9f711c185c6babe18b67d7a53c91b51923dd989aab0870fb438c54f4e0c3bbd2fa0ec5338897db6f1b051cc406eea"

RPROVIDES:${PN} += "config-php8-snmp \
php-snmp \
php8-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
php"

inherit rpm

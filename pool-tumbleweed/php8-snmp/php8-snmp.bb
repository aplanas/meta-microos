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

RPM_NAME = "php8-snmp-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "8bbceb442c37aa4f0aa291477d95e6b2054bb26a63da3259fe40f16403318a621d34e826378b8779aac5bf648e7c5ea2da9d9eb7d1de8187b37ea972b27c9468"

RPROVIDES:${PN} += "config-php8-snmp \
php-snmp \
php8-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
php"

inherit rpm

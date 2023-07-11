SUMMARY = "SNMP extension for PHP"
DESCRIPTION = "The SNMP extension provides a toolset for managing remote devices via \
the Simple Network Management Protocol. \
 \
As it is a wrapper around the underlying Net-SNMP library, all basic \
concepts are the same and the PHP functions change their behavior \
depending on the Net-SNMP configuration files and environment \
variables."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-snmp-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "039290accdae34089ffb15548149c094f68e714d93bb82dace0d4e0adc374f93fcd1bbc3f9507ba4a486321c617f65ba59ad75ecde9f33a46108c4810209a489"

RPROVIDES:${PN} += "config-php8-snmp \
php-snmp \
php8-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
php"

inherit rpm

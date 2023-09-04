SUMMARY = "LDAP protocol support for PHP"
DESCRIPTION = "PHP interface to the Lightweight Directory Access Protocol (LDAP)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-ldap-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "8ab3d9b69e12d304455c8c2b4124af4538074d1244061d207030345481f1a03b2f1a72ea2a65bdbb6bf42342091348d19e8ff269ebbf11758afdbfbd29b88a94"

RPROVIDES:${PN} += "config-php8-ldap \
php-ldap \
php8-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
php"

inherit rpm

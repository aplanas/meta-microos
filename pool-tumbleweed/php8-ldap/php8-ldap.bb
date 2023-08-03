SUMMARY = "LDAP protocol support for PHP"
DESCRIPTION = "PHP interface to the Lightweight Directory Access Protocol (LDAP)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-ldap-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "e58e827831d1c8df01008c111f8507564aa982e4e82b51f5144f298862781dd19487f72e8d70eab62239a2b2f79585c3c055a3a8510cf4fc2a443c94e79a0b12"

RPROVIDES:${PN} += "config-php8-ldap \
php-ldap \
php8-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
php"

inherit rpm

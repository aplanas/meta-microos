SUMMARY = "LDAP protocol support for PHP"
DESCRIPTION = "PHP interface to the Lightweight Directory Access Protocol (LDAP)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-ldap-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "ff67c00b6b663656ee1ea43e4142eb3dab5560f8994d278a851c8563efdf13cf7853e051f35e54e7374ac1f42e2a5db05bc96c5240fcc4ca7e948eb686fc77ba"

RPROVIDES:${PN} += "config-php8-ldap \
php-ldap \
php8-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
php"

inherit rpm

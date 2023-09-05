SUMMARY = "LDAP protocol support for PHP"
DESCRIPTION = "PHP interface to the Lightweight Directory Access Protocol (LDAP)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-ldap-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "1c3dc597a61ca5cec672ed16c9c8c15be8759c0377c640b96364404b29bea52cc1d461ed133663cb4adff5115901e63ca589123eb562745e694df39581b60469"

RPROVIDES:${PN} += "config-php8-ldap \
php-ldap \
php8-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
php"

inherit rpm

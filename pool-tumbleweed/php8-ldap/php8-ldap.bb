SUMMARY = "LDAP protocol support for PHP"
DESCRIPTION = "PHP interface to the Lightweight Directory Access Protocol (LDAP)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-ldap-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "3bd01bb02623981ce3876fcf279c4037b66f7296439e47d0348259b8899d6a58d8ad38ea569b06f242cb2ff835a70449327f56dfb5068aa6a59fbcea831bf0eb"

RPROVIDES:${PN} += "config-php8-ldap \
php-ldap \
php8-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
php"

inherit rpm

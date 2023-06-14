SUMMARY = "LDAP protocol support for PHP"
DESCRIPTION = "PHP interface to the Lightweight Directory Access Protocol (LDAP)."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-ldap-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "d5f2e79b8d5e7e9881fad94d56c6f14574ef7084a409b444055d3b4fbc7af4113c19f7ef1622169bef274547ccbc8513eb89065e41bf88d5addcefd9010f4d58"

RPROVIDES:${PN} += "config-php8-ldap \
php-ldap \
php8-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
php"

inherit rpm

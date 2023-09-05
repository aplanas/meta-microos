SUMMARY = "Postfix LDAP map support"
DESCRIPTION = "This provides support for LDAP maps in Postfix. If you plan to use LDAP \
maps with Postfix, you need this."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-ldap-3.8.1-2.1.aarch64.rpm"
RPM_HASH = "dde487767f0c43e61d0bd086a99bbee11b8ce903ae7e75df0cf4703e58471d1d14f571fc28e519d3c5c38ef55d6fa21314e5550f31f41cc4d14f651dda088b95"

RPROVIDES:${PN} += "config-postfix-ldap \
postfix-/usr/lib/postfix/postfix-ldap.so \
postfix-ldap"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
postfix"

inherit rpm

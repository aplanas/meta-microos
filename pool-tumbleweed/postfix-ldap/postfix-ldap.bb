SUMMARY = "Postfix LDAP map support"
DESCRIPTION = "This provides support for LDAP maps in Postfix. If you plan to use LDAP \
maps with Postfix, you need this."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-ldap-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "ca2f4d62223f0a65fab4eef6a869f21a60e8434915805face1b90a2d73d49c438b6921465852cfb337fbd6126133378a2f01a702e4ca2c9619ae43334135cb29"

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

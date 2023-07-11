SUMMARY = "An interactive LDAP editor for Unix terminals"
DESCRIPTION = "ldapvi is an interactive LDAP client for Unix terminals. \
Using it, you can update LDAP entries with a text editor. \
Think of it as vipw(1) for LDAP."
LICENSE = "GPL-2.0-only"

PV = "1.7"

RPM_NAME = "ldapvi-1.7-2.25.aarch64.rpm"
RPM_HASH = "dfb9e1057ae9046933c18524737b5208250991093f22ba69691ae99421302b44ae914b46ae0810a283efc2e97aecb9810e0149a77494ea55798e368fbf1651d5"

RPROVIDES:${PN} += "ldapvi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libglib-2.0.so.0 \
liblber.so.2 \
libldap.so.2 \
libpopt.so.0 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm

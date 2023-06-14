SUMMARY = "An interactive LDAP editor for Unix terminals"
DESCRIPTION = "ldapvi is an interactive LDAP client for Unix terminals. \
Using it, you can update LDAP entries with a text editor. \
Think of it as vipw(1) for LDAP."
LICENSE = "GPL-2.0-only"

PV = "1.7"

RPM_NAME = "ldapvi-1.7-2.24.aarch64.rpm"
RPM_HASH = "1623181c96be25c0125bfe5b3d79c8f62eb3a8d0ed9e9737f2aa6e3a68ff7f87805f05628e6b0976b20e51cf9e97f9ad2b6403987d3b48fccf3f4b5862c5e56b"

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

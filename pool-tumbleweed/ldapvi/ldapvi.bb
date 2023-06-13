SUMMARY = "An interactive LDAP editor for Unix terminals"
DESCRIPTION = "ldapvi is an interactive LDAP client for Unix terminals. \
Using it, you can update LDAP entries with a text editor. \
Think of it as vipw(1) for LDAP."
LICENSE = "GPL-2.0-only"

PV = "1.7"

RPM_NAME = "ldapvi-1.7-2.24.aarch64.rpm"
RPM_HASH = "1623181c96be25c0125bfe5b3d79c8f62eb3a8d0ed9e9737f2aa6e3a68ff7f87805f05628e6b0976b20e51cf9e97f9ad2b6403987d3b48fccf3f4b5862c5e56b"

RPROVIDES:${PN} += "ldapvi \
ldapvi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libglib-2.0.so.0()(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libreadline.so.8()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm

SUMMARY = "Samba LDB modules"
DESCRIPTION = "This package contains plugins which add Active Directory features to the \
LDB library."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "samba-dsdb-modules-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "54151fb905295db0f6b175eefe03c0d6cf053e1de0a18855819936c134f2b754c7020fbf7eee04c90f40acf5118dd768866b8fd859fdc612c9d294983156ab48"

RPROVIDES:${PN} += "samba-dsdb-modules"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libMESSAGING-samba4.so \
libauthkrb5-samba4.so \
libc.so.6 \
libcli-cldap-samba4.so \
libcli-ldap-common-samba4.so \
libcom-err.so.2 \
libcommon-auth-samba4.so \
libcrypt.so.1 \
libdb-glue-samba4.so \
libdbwrap-samba4.so \
libdcerpc-binding.so.0 \
libdsdb-module-samba4.so \
libevents-samba4.so \
libflag-mapping-samba4.so \
libgenrand-samba4.so \
libgnutls.so.30 \
libgpgme.so.11 \
libkrb5.so.3 \
libkrb5samba-samba4.so \
libldb.so.2 \
libldb2 \
libldbsamba-samba4.so \
libndr-samba-samba4.so \
libndr-samba4.so \
libndr.so.3 \
libnetif-samba4.so \
libreplace-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamdb-common-samba4.so \
libsamdb.so.0 \
libsecrets3-samba4.so \
libsmbpasswdparser-samba4.so \
libtalloc.so.2 \
libtdb-wrap-samba4.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-samba4.so \
libutil-tdb-samba4.so \
samba-ldb-ldap"

inherit rpm

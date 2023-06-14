SUMMARY = "Winbind Daemon libraries"
DESCRIPTION = "This package contains the libraries required by the Winbind daemon."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-winbind-libs-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "55c6ce1ad91549ce2a72ca8e53873cc3a096ec139dba248c09c4ccb72cb6f71f24c14cc2d52ba31d96def02f8f65a8ed5b190c0f45e58c4a413e42b8421d53de"

RPROVIDES:${PN} += "libidmap-samba4.so \
libnss-info-samba4.so \
libnss-winbind.so.2 \
samba-winbind-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libads-samba4.so \
libasn1util-samba4.so \
libc.so.6 \
libcli-ldap-common-samba4.so \
libcom-err.so.2 \
libdbwrap-samba4.so \
libgensec-samba4.so \
libgse-samba4.so \
libkrb5.so.3 \
libldap.so.2 \
libndr.so.3 \
libpam.so.0 \
libreplace-samba4.so \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-modules-samba4.so \
libsamba-passdb.so.0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamba3-util-samba4.so \
libsecrets3-samba4.so \
libsmbconf.so.0 \
libsmbldap.so.2 \
libsmbldaphelper-samba4.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libutil-tdb-samba4.so \
samba-client-libs"

inherit rpm

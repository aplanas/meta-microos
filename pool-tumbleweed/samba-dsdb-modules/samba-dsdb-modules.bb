SUMMARY = "Samba LDB modules"
DESCRIPTION = "This package contains plugins which add Active Directory features to the \
LDB library."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-dsdb-modules-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "03a341dbc5c8c7fe5608ca8663cc7faf7ef93366f0131beecc2388f22bc42db32bb58c8ad000ffa77821ccdea109aa78b9b5edee5770ff1818d0992b6575dbc1"

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

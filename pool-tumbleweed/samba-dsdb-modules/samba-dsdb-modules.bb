SUMMARY = "Samba LDB modules"
DESCRIPTION = "This package contains plugins which add Active Directory features to the \
LDB library."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-dsdb-modules-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "f8a7333e18f1789f02a51cb64c162d8227530e49d92c70ee1db45e9ba5aaf5f069a8436b95442c44dc2f03cad8d8a263bbb608cb0002fc38c593122278d8abd0"

RPROVIDES:${PN} += "samba-dsdb-modules \
samba-dsdb-modules(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libMESSAGING-samba4.so()(64bit) \
libauthkrb5-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-cldap-samba4.so()(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcom_err.so.2()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libcrypt.so.1()(64bit) \
libdb-glue-samba4.so()(64bit) \
libdbwrap-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdsdb-module-samba4.so()(64bit) \
libevents-samba4.so()(64bit) \
libflag-mapping-samba4.so()(64bit) \
libgenrand-samba4.so()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgpgme.so.11()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5samba-samba4.so()(64bit) \
libldb.so.2()(64bit) \
libldb2 \
libldbsamba-samba4.so()(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-samba4.so()(64bit) \
libndr.so.3()(64bit) \
libnetif-samba4.so()(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsamdb.so.0()(64bit) \
libsecrets3-samba4.so()(64bit) \
libsmbpasswdparser-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtdb-wrap-samba4.so()(64bit) \
libtdb.so.1()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libtime-basic-samba4.so()(64bit) \
libutil-tdb-samba4.so()(64bit) \
samba-ldb-ldap"

inherit rpm

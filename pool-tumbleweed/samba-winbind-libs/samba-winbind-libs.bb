SUMMARY = "Winbind Daemon libraries"
DESCRIPTION = "This package contains the libraries required by the Winbind daemon."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-winbind-libs-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "55c6ce1ad91549ce2a72ca8e53873cc3a096ec139dba248c09c4ccb72cb6f71f24c14cc2d52ba31d96def02f8f65a8ed5b190c0f45e58c4a413e42b8421d53de"

RPROVIDES:${PN} += "libidmap-samba4.so()(64bit) \
libnss-info-samba4.so()(64bit) \
libnss_winbind.so.2()(64bit) \
libnss_winbind.so.2(NSS_WINBIND_2)(64bit) \
samba-winbind-libs \
samba-winbind-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libads-samba4.so()(64bit) \
libasn1util-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcom_err.so.2()(64bit) \
libdbwrap-samba4.so()(64bit) \
libgensec-samba4.so()(64bit) \
libgse-samba4.so()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libldap.so.2()(64bit) \
libndr.so.3()(64bit) \
libpam.so.0()(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-modules-samba4.so()(64bit) \
libsamba-passdb.so.0()(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamba3-util-samba4.so()(64bit) \
libsecrets3-samba4.so()(64bit) \
libsmbconf.so.0()(64bit) \
libsmbldap.so.2()(64bit) \
libsmbldap.so.2(SMBLDAP_0)(64bit) \
libsmbldap.so.2(SMBLDAP_1)(64bit) \
libsmbldaphelper-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtdb.so.1()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libutil-tdb-samba4.so()(64bit) \
samba-client-libs"

inherit rpm

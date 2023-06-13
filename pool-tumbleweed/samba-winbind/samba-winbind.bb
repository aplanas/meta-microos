SUMMARY = "Winbind Daemon and Tool"
DESCRIPTION = "This is the winbind-daemon and the wbinfo-tool."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-winbind-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "dd08a3f47c4a750d99d6e884ae355dd8a48ff9e65e683ae708806a755eeae006f8c904e5b02c84ea257961eacbf1e913c77bff49785b4e7d991c305ee3b544d8"

RPROVIDES:${PN} += "config(samba-winbind) \
group(winbind) \
samba-client:/usr/sbin/winbindd \
samba-winbind \
samba-winbind(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libMESSAGING-samba4.so()(64bit) \
libRPC-SERVER-LOOP-samba4.so()(64bit) \
libads-samba4.so()(64bit) \
libauth-samba4.so()(64bit) \
libauthkrb5-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcli-smb-common-samba4.so()(64bit) \
libcliauth-samba4.so()(64bit) \
libcmdline-samba4.so()(64bit) \
libcom_err.so.2()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libdbwrap-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-samba-samba4.so()(64bit) \
libdcerpc-samba4.so()(64bit) \
libdcerpc-server-core.so.0()(64bit) \
libflag-mapping-samba4.so()(64bit) \
libgenrand-samba4.so()(64bit) \
libgensec-samba4.so()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgse-samba4.so()(64bit) \
libidmap-samba4.so()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5samba-samba4.so()(64bit) \
liblibcli-lsa3-samba4.so()(64bit) \
liblibcli-netlogon3-samba4.so()(64bit) \
liblibsmb-samba4.so()(64bit) \
libmsrpc3-samba4.so()(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-samba4.so()(64bit) \
libndr-standard.so.0()(64bit) \
libndr.so.3()(64bit) \
libnss-info-samba4.so()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-passdb.so.0()(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamba3-util-samba4.so()(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsecrets3-samba4.so()(64bit) \
libsmbconf.so.0()(64bit) \
libsmbd-shim-samba4.so()(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libsys-rw-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtdb.so.1()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libtrusts-util-samba4.so()(64bit) \
libutil-tdb-samba4.so()(64bit) \
libwbclient.so.0()(64bit) \
pam-config \
samba-client \
samba-winbind-libs \
sysuser-shadow"

inherit rpm

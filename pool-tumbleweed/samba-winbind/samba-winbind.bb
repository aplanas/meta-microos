SUMMARY = "Winbind Daemon and Tool"
DESCRIPTION = "This is the winbind-daemon and the wbinfo-tool."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-winbind-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "dd08a3f47c4a750d99d6e884ae355dd8a48ff9e65e683ae708806a755eeae006f8c904e5b02c84ea257961eacbf1e913c77bff49785b4e7d991c305ee3b544d8"

RPROVIDES:${PN} += "config-samba-winbind \
group-winbind \
samba-client-/usr/sbin/winbindd \
samba-winbind"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libMESSAGING-samba4.so \
libRPC-SERVER-LOOP-samba4.so \
libads-samba4.so \
libauth-samba4.so \
libauthkrb5-samba4.so \
libc.so.6 \
libcli-ldap-common-samba4.so \
libcli-smb-common-samba4.so \
libcliauth-samba4.so \
libcmdline-samba4.so \
libcom-err.so.2 \
libcommon-auth-samba4.so \
libdbwrap-samba4.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-samba4.so \
libdcerpc-samba4.so \
libdcerpc-server-core.so.0 \
libflag-mapping-samba4.so \
libgenrand-samba4.so \
libgensec-samba4.so \
libgnutls.so.30 \
libgse-samba4.so \
libidmap-samba4.so \
libkrb5.so.3 \
libkrb5samba-samba4.so \
liblibcli-lsa3-samba4.so \
liblibcli-netlogon3-samba4.so \
liblibsmb-samba4.so \
libmsrpc3-samba4.so \
libndr-samba-samba4.so \
libndr-samba4.so \
libndr-standard.so.0 \
libndr.so.3 \
libnss-info-samba4.so \
libpopt.so.0 \
libreplace-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-passdb.so.0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamba3-util-samba4.so \
libsamdb-common-samba4.so \
libsecrets3-samba4.so \
libsmbconf.so.0 \
libsmbd-shim-samba4.so \
libsocket-blocking-samba4.so \
libsys-rw-samba4.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtrusts-util-samba4.so \
libutil-tdb-samba4.so \
libwbclient.so.0 \
pam-config \
samba-client \
samba-winbind-libs \
sysuser-shadow"

inherit rpm

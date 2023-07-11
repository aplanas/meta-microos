SUMMARY = "Winbind Daemon and Tool"
DESCRIPTION = "This is the winbind-daemon and the wbinfo-tool."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "samba-winbind-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "69032b8bb680fdd2cdd9e8811981179e5e16608cbcaf9159553afac40fd1d82c92e3ae366492e7682f14e7879911eeeac19092f4bb7acefa62b28c828fbe3ccb"

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

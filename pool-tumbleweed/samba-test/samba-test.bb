SUMMARY = "Testing tools for Samba servers and clients"
DESCRIPTION = "samba-test provides testing tools for both the server and client \
packages of Samba."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-test-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "0561dbca6049e1c79a2f60e05c911bf278e190486496df6faaf1934535be374a3e0f1facf4c00adbf10d288d42d4ef4422048324d19f4d5c333f63029f8dde39"

RPROVIDES:${PN} += "samba-test"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLIBWBCLIENT-OLD-samba4.so \
libMESSAGING-SEND-samba4.so \
libMESSAGING-samba4.so \
libRPC-SERVER-LOOP-samba4.so \
libaddns-samba4.so \
libads-samba4.so \
libasn1util-samba4.so \
libauth-samba4.so \
libauthkrb5-samba4.so \
libc.so.6 \
libcli-cldap-samba4.so \
libcli-ldap-common-samba4.so \
libcli-ldap-samba4.so \
libcli-nbt-samba4.so \
libcli-smb-common-samba4.so \
libcliauth-samba4.so \
libcluster-samba4.so \
libcmdline-contexts-samba4.so \
libcmdline-samba4.so \
libcom-err.so.2 \
libcommon-auth-samba4.so \
libdbwrap-samba4.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-samba4.so \
libdcerpc-samba4.so \
libdcerpc-server-core.so.0 \
libdcerpc.so.0 \
libdlz-bind9-for-torture-samba4.so \
libdnsserver-common-samba4.so \
libdsdb-module-samba4.so \
libevents-samba4.so \
libflag-mapping-samba4.so \
libgenrand-samba4.so \
libgensec-samba4.so \
libgnutls.so.30 \
libgse-samba4.so \
libidmap-samba4.so \
libk5crypto.so.3 \
libkrb5.so.3 \
libkrb5samba-samba4.so \
libldb.so.2 \
libldbsamba-samba4.so \
liblibcli-lsa3-samba4.so \
liblibcli-netlogon3-samba4.so \
liblibsmb-samba4.so \
libmsrpc3-samba4.so \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr-samba-samba4.so \
libndr-samba4.so \
libndr-standard.so.0 \
libndr.so.3 \
libnetapi.so.1 \
libnetif-samba4.so \
libnss-info-samba4.so \
libpopt.so.0 \
libprinter-driver-samba4.so \
libreadline.so.8 \
libregistry-samba4.so \
libreplace-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-modules-samba4.so \
libsamba-net.cpython-311-aarch64-linux-gnu-samba4.so \
libsamba-passdb.so.0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamba3-util-samba4.so \
libsamdb-common-samba4.so \
libsamdb.so.0 \
libsecrets3-samba4.so \
libserver-id-db-samba4.so \
libshares-samba4.so \
libsmbclient-raw-samba4.so \
libsmbclient.so.0 \
libsmbconf.so.0 \
libsmbd-shim-samba4.so \
libsmbpasswdparser-samba4.so \
libsocket-blocking-samba4.so \
libsys-rw-samba4.so \
libtalloc.so.2 \
libtdb-wrap-samba4.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-samba4.so \
libtorture-samba4.so \
libtrusts-util-samba4.so \
libutil-reg-samba4.so \
libutil-tdb-samba4.so \
libwbclient.so.0 \
samba \
samba-winbind"

inherit rpm

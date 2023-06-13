SUMMARY = "Testing tools for Samba servers and clients"
DESCRIPTION = "samba-test provides testing tools for both the server and client \
packages of Samba."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-test-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "c9a7098d66deed3559790fe12194b463d774430eb07762eaa3c7e8cb5d7cd660514afbfb7bd0a97458c8c32b998f1c4114cd2e1fe2831153fd13d54e93d01310"

RPROVIDES:${PN} += "samba-test \
samba-test(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLIBWBCLIENT-OLD-samba4.so()(64bit) \
libMESSAGING-SEND-samba4.so()(64bit) \
libMESSAGING-samba4.so()(64bit) \
libRPC-SERVER-LOOP-samba4.so()(64bit) \
libaddns-samba4.so()(64bit) \
libads-samba4.so()(64bit) \
libasn1util-samba4.so()(64bit) \
libauth-samba4.so()(64bit) \
libauthkrb5-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-cldap-samba4.so()(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcli-ldap-samba4.so()(64bit) \
libcli-nbt-samba4.so()(64bit) \
libcli-smb-common-samba4.so()(64bit) \
libcliauth-samba4.so()(64bit) \
libcluster-samba4.so()(64bit) \
libcmdline-contexts-samba4.so()(64bit) \
libcmdline-samba4.so()(64bit) \
libcom_err.so.2()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libdbwrap-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-samba-samba4.so()(64bit) \
libdcerpc-samba4.so()(64bit) \
libdcerpc-server-core.so.0()(64bit) \
libdcerpc.so.0()(64bit) \
libdlz-bind9-for-torture-samba4.so()(64bit) \
libdnsserver-common-samba4.so()(64bit) \
libdsdb-module-samba4.so()(64bit) \
libevents-samba4.so()(64bit) \
libflag-mapping-samba4.so()(64bit) \
libgenrand-samba4.so()(64bit) \
libgensec-samba4.so()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libgse-samba4.so()(64bit) \
libidmap-samba4.so()(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5samba-samba4.so()(64bit) \
libldb.so.2()(64bit) \
libldbsamba-samba4.so()(64bit) \
liblibcli-lsa3-samba4.so()(64bit) \
liblibcli-netlogon3-samba4.so()(64bit) \
liblibsmb-samba4.so()(64bit) \
libmsrpc3-samba4.so()(64bit) \
libndr-krb5pac.so.0()(64bit) \
libndr-nbt.so.0()(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-samba4.so()(64bit) \
libndr-standard.so.0()(64bit) \
libndr.so.3()(64bit) \
libnetapi.so.1()(64bit) \
libnetif-samba4.so()(64bit) \
libnss-info-samba4.so()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libprinter-driver-samba4.so()(64bit) \
libreadline.so.8()(64bit) \
libregistry-samba4.so()(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-modules-samba4.so()(64bit) \
libsamba-net.cpython-310-aarch64-linux-gnu-samba4.so()(64bit) \
libsamba-passdb.so.0()(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamba3-util-samba4.so()(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsamdb.so.0()(64bit) \
libsecrets3-samba4.so()(64bit) \
libserver-id-db-samba4.so()(64bit) \
libshares-samba4.so()(64bit) \
libsmbclient-raw-samba4.so()(64bit) \
libsmbclient.so.0()(64bit) \
libsmbconf.so.0()(64bit) \
libsmbd-shim-samba4.so()(64bit) \
libsmbpasswdparser-samba4.so()(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libsys-rw-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtdb-wrap-samba4.so()(64bit) \
libtdb.so.1()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libtime-basic-samba4.so()(64bit) \
libtorture-samba4.so()(64bit) \
libtrusts-util-samba4.so()(64bit) \
libutil-reg-samba4.so()(64bit) \
libutil-tdb-samba4.so()(64bit) \
libwbclient.so.0()(64bit) \
samba \
samba-winbind"

inherit rpm

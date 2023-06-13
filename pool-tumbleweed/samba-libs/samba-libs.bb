SUMMARY = "Samba libraries"
DESCRIPTION = "The samba-libs package contains the libraries needed by programs that \
link against the SMB, RPC and other protocols provided by the Samba suite."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-libs-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "122e6d8a069f5ed1e635cb117b0fd0fc7ddb41a9d9f45419782e1372f8941395a70d760fa8895bcecffe761b9b4f447b5499fa3f99758fb1ec97e6a076dc2231"

RPROVIDES:${PN} += "libLIBWBCLIENT-OLD-samba4.so()(64bit) \
libREG-FULL-samba4.so()(64bit) \
libRPC-SERVER-LOOP-samba4.so()(64bit) \
libRPC-WORKER-samba4.so()(64bit) \
libauth-unix-token-samba4.so()(64bit) \
libauth4-samba4.so()(64bit) \
libcluster-samba4.so()(64bit) \
libcmocka-samba4.so()(64bit) \
libdcerpc-samr.so.0()(64bit) \
libdcerpc-samr0 \
libdnsserver-common-samba4.so()(64bit) \
libdsdb-module-samba4.so()(64bit) \
libgpext-samba4.so()(64bit) \
libposix-eadb-samba4.so()(64bit) \
libprinter-driver-samba4.so()(64bit) \
libshares-samba4.so()(64bit) \
libsmbpasswdparser-samba4.so()(64bit) \
libtalloc-report-samba4.so()(64bit) \
libtorture-samba4.so()(64bit) \
libxattr-tdb-samba4.so()(64bit) \
samba-libs \
samba-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libCHARSET3-samba4.so()(64bit) \
libMESSAGING-SEND-samba4.so()(64bit) \
libMESSAGING-samba4.so()(64bit) \
libauth-samba4.so()(64bit) \
libauthkrb5-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcli-spoolss-samba4.so()(64bit) \
libcliauth-samba4.so()(64bit) \
libcmdline-samba4.so()(64bit) \
libcom_err.so.2()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libdb-glue-samba4.so()(64bit) \
libdbwrap-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-samba4.so()(64bit) \
libdcerpc-server-core.so.0()(64bit) \
libflag-mapping-samba4.so()(64bit) \
libgenrand-samba4.so()(64bit) \
libgpo-samba4.so()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5samba-samba4.so()(64bit) \
libldb.so.2()(64bit) \
libldbsamba-samba4.so()(64bit) \
libmsrpc3-samba4.so()(64bit) \
libndr-nbt.so.0()(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-samba4.so()(64bit) \
libndr.so.3()(64bit) \
libnetif-samba4.so()(64bit) \
libnpa-tstream-samba4.so()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-modules-samba4.so()(64bit) \
libsamba-passdb.so.0()(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamba3-util-samba4.so()(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsamdb.so.0()(64bit) \
libsecrets3-samba4.so()(64bit) \
libsmb-transport-samba4.so()(64bit) \
libsmbconf.so.0()(64bit) \
libsmbd-base-samba4.so()(64bit) \
libsmbd-shim-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtdb.so.1()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libutil-reg-samba4.so()(64bit) \
libutil-tdb-samba4.so()(64bit) \
libwbclient.so.0()(64bit) \
samba-client-libs"

inherit rpm

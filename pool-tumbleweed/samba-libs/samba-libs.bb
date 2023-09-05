SUMMARY = "Samba libraries"
DESCRIPTION = "The samba-libs package contains the libraries needed by programs that \
link against the SMB, RPC and other protocols provided by the Samba suite."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-libs-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "9ffd0ad41180e97bb8550d065e27632cdc7c04188a71c3e03b6a8e56699d05fc7910404f60d6cb22f7d2d3488b3d6c61b07e8b7765236fefd689cc64d0bdf560"

RPROVIDES:${PN} += "libLIBWBCLIENT-OLD-samba4.so \
libREG-FULL-samba4.so \
libRPC-SERVER-LOOP-samba4.so \
libRPC-WORKER-samba4.so \
libauth-unix-token-samba4.so \
libauth4-samba4.so \
libcmocka-samba4.so \
libdcerpc-samr.so.0 \
libdcerpc-samr0 \
libdnsserver-common-samba4.so \
libdsdb-module-samba4.so \
libgpext-samba4.so \
libposix-eadb-samba4.so \
libprinter-driver-samba4.so \
libshares-samba4.so \
libsmbpasswdparser-samba4.so \
libtalloc-report-samba4.so \
libtorture-samba4.so \
libxattr-tdb-samba4.so \
samba-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCHARSET3-samba4.so \
libMESSAGING-SEND-samba4.so \
libMESSAGING-samba4.so \
libauth-samba4.so \
libauthkrb5-samba4.so \
libc.so.6 \
libcli-ldap-common-samba4.so \
libcli-spoolss-samba4.so \
libcliauth-samba4.so \
libcmdline-samba4.so \
libcom-err.so.2 \
libcommon-auth-samba4.so \
libdb-glue-samba4.so \
libdbwrap-samba4.so \
libdcerpc-binding.so.0 \
libdcerpc-samba4.so \
libdcerpc-server-core.so.0 \
libflag-mapping-samba4.so \
libgenrand-samba4.so \
libgpo-samba4.so \
libkrb5.so.3 \
libkrb5samba-samba4.so \
libldb.so.2 \
libldbsamba-samba4.so \
libmsrpc3-samba4.so \
libndr-nbt.so.0 \
libndr-samba-samba4.so \
libndr-samba4.so \
libndr.so.3 \
libnetif-samba4.so \
libnpa-tstream-samba4.so \
libpopt.so.0 \
libreplace-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-modules-samba4.so \
libsamba-passdb.so.0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamba3-util-samba4.so \
libsamdb-common-samba4.so \
libsamdb.so.0 \
libsecrets3-samba4.so \
libsmb-transport-samba4.so \
libsmbconf.so.0 \
libsmbd-base-samba4.so \
libsmbd-shim-samba4.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libutil-reg-samba4.so \
libutil-tdb-samba4.so \
libwbclient.so.0 \
samba-client-libs"

inherit rpm

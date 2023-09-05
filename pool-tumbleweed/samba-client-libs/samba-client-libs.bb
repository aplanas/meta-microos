SUMMARY = "Samba client libraries"
DESCRIPTION = "The samba-libs package contains the libraries needed by samba client \
programs."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-client-libs-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "0ce22df28615bde01d2c73be71896faf7a9dc5b1a216c1e989fa1b4d703f34e825205feabf2069eaf6332020eaa90b839e0846c296031eb311642d3faa7df512"

RPROVIDES:${PN} += "libCHARSET3-samba4.so \
libMESSAGING-SEND-samba4.so \
libMESSAGING-samba4.so \
libaddns-samba4.so \
libads-samba4.so \
libasn1util-samba4.so \
libauth-samba4.so \
libauthkrb5-samba4.so \
libcli-cldap-samba4.so \
libcli-ldap-common-samba4.so \
libcli-ldap-samba4.so \
libcli-nbt-samba4.so \
libcli-smb-common-samba4.so \
libcli-spoolss-samba4.so \
libcliauth-samba4.so \
libclidns-samba4.so \
libcluster-samba4.so \
libcmdline-contexts-samba4.so \
libcmdline-samba4.so \
libcommon-auth-samba4.so \
libdbwrap-samba4.so \
libdcerpc-binding.so.0 \
libdcerpc-binding0 \
libdcerpc-pkt-auth-samba4.so \
libdcerpc-samba-samba4.so \
libdcerpc-samba4.so \
libdcerpc-server-core.so.0 \
libdcerpc.so.0 \
libdcerpc0 \
libdfs-server-ad-samba4.so \
libevents-samba4.so \
libflag-mapping-samba4.so \
libgenrand-samba4.so \
libgensec-samba4.so \
libgpo-samba4.so \
libgse-samba4.so \
libhttp-samba4.so \
libinterfaces-samba4.so \
libiov-buf-samba4.so \
libkrb5samba-samba4.so \
libldbsamba-samba4.so \
liblibcli-lsa3-samba4.so \
liblibcli-netlogon3-samba4.so \
liblibsmb-samba4.so \
libmessages-dgm-samba4.so \
libmessages-util-samba4.so \
libmscat-samba4.so \
libmsghdr-samba4.so \
libmsrpc3-samba4.so \
libndr-krb5pac.so.0 \
libndr-krb5pac0 \
libndr-nbt.so.0 \
libndr-nbt0 \
libndr-samba-samba4.so \
libndr-samba4.so \
libndr-standard.so.0 \
libndr-standard0 \
libndr.so.3 \
libndr2 \
libnet-keytab-samba4.so \
libnetapi.so.1 \
libnetapi0 \
libnetif-samba4.so \
libnpa-tstream-samba4.so \
libprinting-migrate-samba4.so \
libregistry-samba4.so \
libreplace-samba4.so \
libsamba-cluster-support-samba4.so \
libsamba-credentials.so.1 \
libsamba-credentials1 \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-errors0 \
libsamba-hostconfig.so.0 \
libsamba-hostconfig0 \
libsamba-modules-samba4.so \
libsamba-passdb.so.0 \
libsamba-passdb0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamba-util0 \
libsamba3-util-samba4.so \
libsamdb-common-samba4.so \
libsamdb.so.0 \
libsamdb0 \
libsecrets3-samba4.so \
libserver-id-db-samba4.so \
libserver-role-samba4.so \
libsmb-transport-samba4.so \
libsmbclient-raw-samba4.so \
libsmbclient.so.0 \
libsmbclient0 \
libsmbconf.so.0 \
libsmbconf0 \
libsmbd-base-samba4.so \
libsmbd-shim-samba4.so \
libsmbldap.so.2 \
libsmbldap2 \
libsmbldaphelper-samba4.so \
libsocket-blocking-samba4.so \
libstable-sort-samba4.so \
libsys-rw-samba4.so \
libtalloc-report-printf-samba4.so \
libtdb-wrap-samba4.so \
libtevent-util.so.0 \
libtevent-util0 \
libtime-basic-samba4.so \
libtrusts-util-samba4.so \
libutil-reg-samba4.so \
libutil-setid-samba4.so \
libutil-tdb-samba4.so \
libwbclient.so.0 \
libwbclient0 \
samba-client-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcom-err.so.2 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libjansson.so.4 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libldb.so.2 \
libnscd.so.1 \
libpam.so.0 \
libpopt.so.0 \
libsystemd.so.0 \
libtalloc.so.2 \
libtasn1.so.6 \
libtdb.so.1 \
libtevent.so.0 \
libz.so.1"

inherit rpm

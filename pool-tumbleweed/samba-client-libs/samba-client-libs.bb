SUMMARY = "Samba client libraries"
DESCRIPTION = "The samba-libs package contains the libraries needed by samba client \
programs."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-client-libs-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "ddc774949ba7ff7c8bfa3e86463dd7516feea46968e87b74eaa75676ed53ff6042f042f1c98ea8a71ebdceae2a4903d95417fcb459e4551ad9530138d2f11aa4"

RPROVIDES:${PN} += "libCHARSET3-samba4.so()(64bit) \
libMESSAGING-SEND-samba4.so()(64bit) \
libMESSAGING-samba4.so()(64bit) \
libaddns-samba4.so()(64bit) \
libads-samba4.so()(64bit) \
libasn1util-samba4.so()(64bit) \
libauth-samba4.so()(64bit) \
libauthkrb5-samba4.so()(64bit) \
libcli-cldap-samba4.so()(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcli-ldap-samba4.so()(64bit) \
libcli-nbt-samba4.so()(64bit) \
libcli-smb-common-samba4.so()(64bit) \
libcli-spoolss-samba4.so()(64bit) \
libcliauth-samba4.so()(64bit) \
libclidns-samba4.so()(64bit) \
libcmdline-contexts-samba4.so()(64bit) \
libcmdline-samba4.so()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libdbwrap-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-binding0 \
libdcerpc-pkt-auth-samba4.so()(64bit) \
libdcerpc-samba-samba4.so()(64bit) \
libdcerpc-samba4.so()(64bit) \
libdcerpc-server-core.so.0()(64bit) \
libdcerpc.so.0()(64bit) \
libdcerpc0 \
libdfs-server-ad-samba4.so()(64bit) \
libevents-samba4.so()(64bit) \
libflag-mapping-samba4.so()(64bit) \
libgenrand-samba4.so()(64bit) \
libgensec-samba4.so()(64bit) \
libgpo-samba4.so()(64bit) \
libgse-samba4.so()(64bit) \
libhttp-samba4.so()(64bit) \
libinterfaces-samba4.so()(64bit) \
libiov-buf-samba4.so()(64bit) \
libkrb5samba-samba4.so()(64bit) \
libldbsamba-samba4.so()(64bit) \
liblibcli-lsa3-samba4.so()(64bit) \
liblibcli-netlogon3-samba4.so()(64bit) \
liblibsmb-samba4.so()(64bit) \
libmessages-dgm-samba4.so()(64bit) \
libmessages-util-samba4.so()(64bit) \
libmscat-samba4.so()(64bit) \
libmsghdr-samba4.so()(64bit) \
libmsrpc3-samba4.so()(64bit) \
libndr-krb5pac.so.0()(64bit) \
libndr-krb5pac0 \
libndr-nbt.so.0()(64bit) \
libndr-nbt0 \
libndr-samba-samba4.so()(64bit) \
libndr-samba4.so()(64bit) \
libndr-standard.so.0()(64bit) \
libndr-standard0 \
libndr.so.3()(64bit) \
libndr2 \
libnet-keytab-samba4.so()(64bit) \
libnetapi.so.1()(64bit) \
libnetapi0 \
libnetif-samba4.so()(64bit) \
libnpa-tstream-samba4.so()(64bit) \
libprinting-migrate-samba4.so()(64bit) \
libregistry-samba4.so()(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-cluster-support-samba4.so()(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-credentials1 \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-errors0 \
libsamba-hostconfig.so.0()(64bit) \
libsamba-hostconfig0 \
libsamba-modules-samba4.so()(64bit) \
libsamba-passdb.so.0()(64bit) \
libsamba-passdb0 \
libsamba-security-samba4.so()(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamba-util0 \
libsamba3-util-samba4.so()(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsamdb.so.0()(64bit) \
libsamdb0 \
libsecrets3-samba4.so()(64bit) \
libserver-id-db-samba4.so()(64bit) \
libserver-role-samba4.so()(64bit) \
libsmb-transport-samba4.so()(64bit) \
libsmbclient-raw-samba4.so()(64bit) \
libsmbclient.so.0()(64bit) \
libsmbclient0 \
libsmbconf.so.0()(64bit) \
libsmbconf0 \
libsmbd-base-samba4.so()(64bit) \
libsmbd-shim-samba4.so()(64bit) \
libsmbldap.so.2()(64bit) \
libsmbldap.so.2(SMBLDAP_0)(64bit) \
libsmbldap.so.2(SMBLDAP_1)(64bit) \
libsmbldap.so.2(SMBLDAP_2)(64bit) \
libsmbldap2 \
libsmbldaphelper-samba4.so()(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libstable-sort-samba4.so()(64bit) \
libsys-rw-samba4.so()(64bit) \
libtalloc-report-printf-samba4.so()(64bit) \
libtdb-wrap-samba4.so()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent-util0 \
libtime-basic-samba4.so()(64bit) \
libtrusts-util-samba4.so()(64bit) \
libutil-reg-samba4.so()(64bit) \
libutil-setid-samba4.so()(64bit) \
libutil-tdb-samba4.so()(64bit) \
libwbclient.so.0()(64bit) \
libwbclient0 \
samba-client-libs \
samba-client-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libacl.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit) \
libcluster-samba4.so()(64bit) \
libcom_err.so.2()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_10)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libjansson.so.4()(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libldb.so.2()(64bit) \
libnscd.so.1()(64bit) \
libpam.so.0()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtalloc.so.2()(64bit) \
libtasn1.so.6()(64bit) \
libtasn1.so.6(LIBTASN1_0_3)(64bit) \
libtdb.so.1()(64bit) \
libtevent.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm

SUMMARY = "Samba Active Directory Domain Controller libraries"
DESCRIPTION = "This package contains the Active Directory-compatible Domain Controller \
libraries."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-ad-dc-libs-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "86d4211ac59a46785a320936627c89612c256ce81c72d7a366a7538866d57a4bbd159580088fbe9d6b0aea3b6a47051c785c24193c8422cc551334bf1d659fa9"

RPROVIDES:${PN} += "libdb-glue-samba4.so()(64bit) \
libdcerpc-server.so.0()(64bit) \
libdlz-bind9-for-torture-samba4.so()(64bit) \
libdsdb-garbage-collect-tombstones-samba4.so()(64bit) \
libpac-samba4.so()(64bit) \
libprocess-model-samba4.so()(64bit) \
libscavenge-dns-records-samba4.so()(64bit) \
libservice-samba4.so()(64bit) \
samba-ad-dc-libs \
samba-ad-dc-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLIBWBCLIENT-OLD-samba4.so()(64bit) \
libMESSAGING-SEND-samba4.so()(64bit) \
libMESSAGING-samba4.so()(64bit) \
libasn1util-samba4.so()(64bit) \
libauth4-samba4.so()(64bit) \
libauthkrb5-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-cldap-samba4.so()(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcli-ldap-samba4.so()(64bit) \
libcli-nbt-samba4.so()(64bit) \
libcliauth-samba4.so()(64bit) \
libclidns-samba4.so()(64bit) \
libcluster-samba4.so()(64bit) \
libcom_err.so.2()(64bit) \
libcommon-auth-samba4.so()(64bit) \
libdbwrap-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-samba-samba4.so()(64bit) \
libdcerpc-samba4.so()(64bit) \
libdcerpc-server-core.so.0()(64bit) \
libdcerpc.so.0()(64bit) \
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
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkadm5srv_mit.so.12()(64bit) \
libkadm5srv_mit.so.12(kadm5srv_mit_12_MIT)(64bit) \
libkdb5.so.10()(64bit) \
libkdb5.so.10(kdb5_10_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5samba-samba4.so()(64bit) \
libldb.so.2()(64bit) \
libldbsamba-samba4.so()(64bit) \
libmessages-dgm-samba4.so()(64bit) \
libndr-krb5pac.so.0()(64bit) \
libndr-nbt.so.0()(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-samba4.so()(64bit) \
libndr-standard.so.0()(64bit) \
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
libsamdb-common-samba4.so()(64bit) \
libsamdb.so.0()(64bit) \
libsecrets3-samba4.so()(64bit) \
libsmbconf.so.0()(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libtime-basic-samba4.so()(64bit) \
samba-client-libs \
samba-libs"

inherit rpm

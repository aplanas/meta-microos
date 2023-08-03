SUMMARY = "Samba Active Directory Domain Controller libraries"
DESCRIPTION = "This package contains the Active Directory-compatible Domain Controller \
libraries."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "samba-ad-dc-libs-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "6cfc987eef69decd85da41c4fc63de7a9e64925f26e4336b130b39809e40180ff5e79beaed97f8ccee47a0343efe85ffd59bfed561d0dcf122d2e7dc90908f0e"

RPROVIDES:${PN} += "libdb-glue-samba4.so \
libdcerpc-server.so.0 \
libdlz-bind9-for-torture-samba4.so \
libdsdb-garbage-collect-tombstones-samba4.so \
libpac-samba4.so \
libprocess-model-samba4.so \
libscavenge-dns-records-samba4.so \
libservice-samba4.so \
samba-ad-dc-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLIBWBCLIENT-OLD-samba4.so \
libMESSAGING-SEND-samba4.so \
libMESSAGING-samba4.so \
libasn1util-samba4.so \
libauth4-samba4.so \
libauthkrb5-samba4.so \
libc.so.6 \
libcli-cldap-samba4.so \
libcli-ldap-common-samba4.so \
libcli-ldap-samba4.so \
libcli-nbt-samba4.so \
libcliauth-samba4.so \
libclidns-samba4.so \
libcluster-samba4.so \
libcom-err.so.2 \
libcommon-auth-samba4.so \
libdbwrap-samba4.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-samba4.so \
libdcerpc-samba4.so \
libdcerpc-server-core.so.0 \
libdcerpc.so.0 \
libdnsserver-common-samba4.so \
libdsdb-module-samba4.so \
libevents-samba4.so \
libflag-mapping-samba4.so \
libgenrand-samba4.so \
libgensec-samba4.so \
libgnutls.so.30 \
libk5crypto.so.3 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrb5.so.3 \
libkrb5samba-samba4.so \
libldb.so.2 \
libldbsamba-samba4.so \
libmessages-dgm-samba4.so \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr-samba-samba4.so \
libndr-samba4.so \
libndr-standard.so.0 \
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
libsamdb-common-samba4.so \
libsamdb.so.0 \
libsecrets3-samba4.so \
libsmbconf.so.0 \
libsocket-blocking-samba4.so \
libtalloc.so.2 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-samba4.so \
samba-client-libs \
samba-libs"

inherit rpm

SUMMARY = "389 Directory Server"
DESCRIPTION = "389 Directory Server is a full-featured LDAPv3 compliant server. In \
addition to the standard LDAPv3 operations, it supports multi-master \
replication, fully online configuration and administration, chaining, \
virtual attributes, access control directives in the data, Virtual \
List View, server-side sorting, SASL, TLS/SSL, and many other \
features. (The server started out as Netscape Directory Server.)"
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git18.37ec5cd"

RPM_NAME = "389-ds-2.4.0~git18.37ec5cd-1.2.aarch64.rpm"
RPM_HASH = "66996d20c5efda3c5e40959e38f805f3b193d8bad40abf066202c0f58e5f6525fc44b2825b7d221ac7038504abc56f26e350053b073219540b7bbf50a52d9235"

RPROVIDES:${PN} += "389-ds \
389-ds(aarch-64) \
389-ds-base \
config(389-ds) \
group(dirsrv) \
libacctpolicy-plugin.so()(64bit) \
libacctusability-plugin.so()(64bit) \
libacl-plugin.so()(64bit) \
libaddn-plugin.so()(64bit) \
libalias-entries-plugin.so()(64bit) \
libattr-unique-plugin.so()(64bit) \
libautomember-plugin.so()(64bit) \
libback-ldbm.so()(64bit) \
libbitwise-plugin.so()(64bit) \
libchainingdb-plugin.so()(64bit) \
libcollation-plugin.so()(64bit) \
libcontentsync-plugin.so()(64bit) \
libcos-plugin.so()(64bit) \
libderef-plugin.so()(64bit) \
libdistrib-plugin.so()(64bit) \
libdna-plugin.so()(64bit) \
libentryuuid-plugin.so()(64bit) \
libentryuuid-syntax-plugin.so()(64bit) \
libldaputil.so.0()(64bit) \
liblinkedattrs-plugin.so()(64bit) \
libmanagedentries-plugin.so()(64bit) \
libmemberof-plugin.so()(64bit) \
libns-dshttpd.so.0()(64bit) \
libpam-passthru-plugin.so()(64bit) \
libpassthru-plugin.so()(64bit) \
libpbe-plugin.so()(64bit) \
libposix-winsync-plugin.so()(64bit) \
libpwdchan-plugin.so()(64bit) \
libpwdstorage-plugin.so()(64bit) \
libreferint-plugin.so()(64bit) \
libreplication-plugin.so()(64bit) \
libretrocl-plugin.so()(64bit) \
librewriters.so.0()(64bit) \
libroles-plugin.so()(64bit) \
librootdn-access-plugin.so()(64bit) \
libschemareload-plugin.so()(64bit) \
libslapd.so.0()(64bit) \
libstatechange-plugin.so()(64bit) \
libsyntax-plugin.so()(64bit) \
libusn-plugin.so()(64bit) \
libviews-plugin.so()(64bit) \
libwhoami-plugin.so()(64bit) \
user(dirsrv)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
/usr/sbin/service \
acl \
cyrus-sasl-plain \
db-utils \
fillup \
krb5 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
lib389 \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libcrack.so.2()(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdb-4.8.so()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
liblmdb-0.9.30.so()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.10.2)(64bit) \
libnss3.so(NSS_3.12)(64bit) \
libnss3.so(NSS_3.15)(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.6)(64bit) \
libnss3.so(NSS_3.9)(64bit) \
libnss3.so(NSS_3.9.2)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpcre2-8.so.0()(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
libsasl2.so.3()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libssl3.so()(64bit) \
libssl3.so(NSS_3.12.6)(64bit) \
libssl3.so(NSS_3.14)(64bit) \
libssl3.so(NSS_3.2)(64bit) \
libssl3.so(NSS_3.20)(64bit) \
libssl3.so(NSS_3.4)(64bit) \
libssl3.so(NSS_3.7.4)(64bit) \
libsvrcore.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libz.so.1()(64bit) \
permissions \
sysuser-shadow"

inherit rpm

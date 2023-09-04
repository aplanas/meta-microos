SUMMARY = "389 Directory Server"
DESCRIPTION = "389 Directory Server is a full-featured LDAPv3 compliant server. In \
addition to the standard LDAPv3 operations, it supports multi-master \
replication, fully online configuration and administration, chaining, \
virtual attributes, access control directives in the data, Virtual \
List View, server-side sorting, SASL, TLS/SSL, and many other \
features. (The server started out as Netscape Directory Server.)"
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git74.4297d88"

RPM_NAME = "389-ds-2.4.0~git74.4297d88-1.1.aarch64.rpm"
RPM_HASH = "51bb0798c215afdb9f4c2cb71da581e9059d9b483427f7b2c146b8c7032cd4fbe555fe4fe37bc7c3d089b41abecde15e2c095c5afc7a8ea1e9199522a09a6c91"

RPROVIDES:${PN} += "389-ds \
389-ds-base \
config-389-ds \
group-dirsrv \
libacctpolicy-plugin.so \
libacctusability-plugin.so \
libacl-plugin.so \
libaddn-plugin.so \
libalias-entries-plugin.so \
libattr-unique-plugin.so \
libautomember-plugin.so \
libback-ldbm.so \
libbitwise-plugin.so \
libchainingdb-plugin.so \
libcollation-plugin.so \
libcontentsync-plugin.so \
libcos-plugin.so \
libderef-plugin.so \
libdistrib-plugin.so \
libdna-plugin.so \
libentryuuid-plugin.so \
libentryuuid-syntax-plugin.so \
libldaputil.so.0 \
liblinkedattrs-plugin.so \
libmanagedentries-plugin.so \
libmemberof-plugin.so \
libns-dshttpd.so.0 \
libpam-passthru-plugin.so \
libpassthru-plugin.so \
libpbe-plugin.so \
libposix-winsync-plugin.so \
libpwdchan-plugin.so \
libpwdstorage-plugin.so \
libreferint-plugin.so \
libreplication-plugin.so \
libretrocl-plugin.so \
librewriters.so.0 \
libroles-plugin.so \
librootdn-access-plugin.so \
libschemareload-plugin.so \
libslapd.so.0 \
libstatechange-plugin.so \
libsyntax-plugin.so \
libusn-plugin.so \
libviews-plugin.so \
libwhoami-plugin.so \
user-dirsrv"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
/usr/sbin/service \
acl \
cyrus-sasl-plain \
db-utils \
fillup \
krb5 \
ld-linux-aarch64.so.1 \
lib389 \
libc.so.6 \
libcom-err.so.2 \
libcrack.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libdb-4.8.so \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libjson-c.so.5 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
liblmdb-0.9.30.so \
libm.so.6 \
libnspr4.so \
libnss3.so \
libpam.so.0 \
libpcre2-8.so.0 \
libplc4.so \
libplds4.so \
libsasl2.so.3 \
libssl.so.3 \
libssl3.so \
libsvrcore.so.0 \
libsystemd.so.0 \
libz.so.1 \
permissions \
sysuser-shadow"

inherit rpm

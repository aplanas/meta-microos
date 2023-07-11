SUMMARY = "Development files for the 389 Directory Server"
DESCRIPTION = "389 Directory Server is a full-featured LDAPv3 compliant server. In \
addition to the standard LDAPv3 operations, it supports multi-master \
replication, fully online configuration and administration, chaining, \
virtual attributes, access control directives in the data, Virtual \
List View, server-side sorting, SASL, TLS/SSL, and many other \
features. \
 \
This package contains the development files for 389DS."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git18.37ec5cd"

RPM_NAME = "389-ds-devel-2.4.0~git18.37ec5cd-1.3.aarch64.rpm"
RPM_HASH = "599aead40ebdf531c39c1e74de496f3ad6d17e8de58cdd1c70b74f4ebee802c72f8269cdbe6db0663b5817b6cdf855bb346cb62d31234a467f0f23dc1ee7df47"

RPROVIDES:${PN} += "389-ds-devel \
pkgconfig-dirsrv \
pkgconfig-svrcore \
svrcore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
389-ds \
libevent-devel \
libsvrcore0 \
openldap2-devel \
pkgconfig \
pkgconfig-nspr \
pkgconfig-nss \
pkgconfig-systemd"

inherit rpm

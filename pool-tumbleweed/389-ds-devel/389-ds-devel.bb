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

PV = "2.4.0~git74.4297d88"

RPM_NAME = "389-ds-devel-2.4.0~git74.4297d88-1.1.aarch64.rpm"
RPM_HASH = "fd0c3bed94143061c3c2bc99e33b495f4d417a49a615cf4f63a47d8f34f9925c16970f046d6e58abc30c0257ca28d08bf5b5cbf0a45fe2418daa0926d2550646"

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

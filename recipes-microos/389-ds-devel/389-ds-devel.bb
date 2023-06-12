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

RPM_NAME = "389-ds-devel-2.4.0~git18.37ec5cd-1.2.aarch64.rpm"
RPM_HASH = "6961b9e8ad79b5437b12c5dccc91c38f94addba8eb709afd8cd7af533d7ba3a674050de4e8ee6f4edbf09290d2b14ed298086b7509aba748a9ea4ea2fa270296"

RPROVIDES:${PN} += "389-ds-devel 389-ds-devel(aarch-64) pkgconfig(dirsrv) pkgconfig(svrcore) svrcore-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config 389-ds libevent-devel libsvrcore0 openldap2-devel pkgconfig pkgconfig(nspr) pkgconfig(nss) pkgconfig(systemd)"

inherit rpm

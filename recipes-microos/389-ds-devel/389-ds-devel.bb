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

PV = "2.4.0~git0.87efeb2"

RPM_NAME = "389-ds-devel-2.4.0~git0.87efeb2-1.1.aarch64.rpm"
RPM_HASH = "9ba497b319e0f187661c21ea281aace48ad3326ae8ede1f43a198a01bd7038ec3467535e71b195b3e31ef97de25fbb3fe930345a6e896bd1aff0b7461747864d"

RPROVIDES:${PN} += "389-ds-devel 389-ds-devel(aarch-64) pkgconfig(dirsrv) pkgconfig(svrcore) svrcore-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config 389-ds libevent-devel libsvrcore0 openldap2-devel pkgconfig pkgconfig(nspr) pkgconfig(nss) pkgconfig(systemd)"

inherit rpm

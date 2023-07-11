SUMMARY = "Libraries and Header Files to Develop Programs with ldb2 Support"
DESCRIPTION = "LDB is an LDAP-like embedded database. \
 \
Libraries and Header Files to Develop Programs with ldb2 Support."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libldb-devel-2.7.2-1.2.aarch64.rpm"
RPM_HASH = "4ec7aa8de771423ed01a1a8cd748d700562d717a928473bbf1df1657b9a975fdabfee41272347c6e3dd598b409d051e761e13763556139c272ad6f3c7839fd35"

RPROVIDES:${PN} += "libldb-devel \
pkgconfig-ldb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldb2 \
pkg-config \
pkgconfig-talloc \
pkgconfig-tdb"

inherit rpm

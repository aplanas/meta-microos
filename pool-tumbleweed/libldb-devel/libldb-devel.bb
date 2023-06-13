SUMMARY = "Libraries and Header Files to Develop Programs with ldb2 Support"
DESCRIPTION = "LDB is an LDAP-like embedded database. \
 \
Libraries and Header Files to Develop Programs with ldb2 Support."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libldb-devel-2.7.2-1.1.aarch64.rpm"
RPM_HASH = "986efff8f1b2cb39c59453dc56c71e42c66bd486a7833d411e64223e93b67bff3cb27b06589f85005d8a48a65595ce3f79c3dae128a22d701cb2867f51320b0b"

RPROVIDES:${PN} += "libldb-devel \
libldb-devel(aarch-64) \
pkgconfig(ldb)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldb2 \
pkgconf-pkg-config \
pkgconfig(talloc) \
pkgconfig(tdb)"

inherit rpm

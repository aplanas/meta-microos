SUMMARY = "Header files for libaudit"
DESCRIPTION = "The audit-devel package contains the header files \
needed for developing applications that need to use the audit framework \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "audit-devel-3.0.9-1.3.aarch64.rpm"
RPM_HASH = "f0b27793e9256b1e705c98030c3e7276ccfbaf7a8dcca0f8f37335dfc9307cd5bedd76ae382137d262c4569d8f89276585e66cc2f7e0ca492acad8199b2b93bc"

RPROVIDES:${PN} += "audit-devel audit-devel(aarch-64) pkgconfig(audit) pkgconfig(auparse)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libaudit1 libauparse0"

inherit rpm

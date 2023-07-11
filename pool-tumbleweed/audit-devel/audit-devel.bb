SUMMARY = "Header files for libaudit"
DESCRIPTION = "The audit-devel package contains the header files \
needed for developing applications that need to use the audit framework \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "audit-devel-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "8b5501512baec63f29653de31d9e3e0bfc8b566261a9e4aba3e122d561dd51f160a899c09a29cec4fc2a65f96eb11e3e244e49d926e3d7d3be278b4c9561df67"

RPROVIDES:${PN} += "audit-devel \
pkgconfig-audit \
pkgconfig-auparse"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudit1 \
libauparse0"

inherit rpm

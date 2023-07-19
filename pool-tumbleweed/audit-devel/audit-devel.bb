SUMMARY = "Header files for libaudit"
DESCRIPTION = "The audit-devel package contains the header files \
needed for developing applications that need to use the audit framework \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.1"

RPM_NAME = "audit-devel-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "06e15806f1b886d1f0d1fed32782d8fbb745562f908d82e9007e7eda1ecfd545b4920c47db4039669bcd78de6b87a408e38375d0b04c3acd148e9843eb16621e"

RPROVIDES:${PN} += "audit-devel \
pkgconfig-audit \
pkgconfig-auparse"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudit1 \
libauparse0"

inherit rpm

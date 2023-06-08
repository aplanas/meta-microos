SUMMARY = "Libraries and headers for CharLS"
DESCRIPTION = "This package contains libraries and headers for CharLS."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "CharLS-devel-2.4.1-1.3.aarch64.rpm"
RPM_HASH = "f3438367088b353574875fdd0077788e9c5b55045fdf976da7a072552dd664ae8debb23195c480aa4b1b86f1e44a550e69b16740c6a4b907269c16aab2ddae67"

RPROVIDES:${PN} += "CharLS-devel CharLS-devel(aarch-64) cmake(charls) pkgconfig(charls)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcharls2"

inherit rpm

SUMMARY = "Development files for stellarsolver"
DESCRIPTION = "Development headers and libraries for stellarsolver."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "stellarsolver-devel-2.4-2.3.aarch64.rpm"
RPM_HASH = "bc01a01bf452f81aab1fa458a8ea9dc4f57bf43c43b9d67e342dd2b54e2401510c85abd13408a51e645d69bd86f450f6f291453d2eb5afc6fb603b5b8b333e72"

RPROVIDES:${PN} += "cmake(StellarSolver) \
pkgconfig(stellarsolver) \
stellarsolver-devel \
stellarsolver-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstellarsolver2"

inherit rpm

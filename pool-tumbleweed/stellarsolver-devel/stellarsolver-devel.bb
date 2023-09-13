SUMMARY = "Development files for stellarsolver"
DESCRIPTION = "Development headers and libraries for stellarsolver."
LICENSE = "GPL-3.0-or-later"

PV = "2.5"

RPM_NAME = "stellarsolver-devel-2.5-1.1.aarch64.rpm"
RPM_HASH = "2be1820c6ac7f68dd4a4cd571b952de527806d3bcbeb1aa7174937eb64d353811397dfff27c6082399110581f12fd01bd271b3ea07bc5c4a7af551abb2381821"

RPROVIDES:${PN} += "cmake-StellarSolver \
pkgconfig-stellarsolver \
stellarsolver-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstellarsolver2"

inherit rpm

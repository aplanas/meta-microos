SUMMARY = "Development files for stellarsolver"
DESCRIPTION = "Development headers and libraries for stellarsolver."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "stellarsolver-devel-2.4-2.4.aarch64.rpm"
RPM_HASH = "430929561bcfde8be685779e92fe03b7b8d9940b2d5d6fe95da83926a2d08fa415ba1049842050eab18fdd6ebb61dc657238f5b3aa8d02bda7cb24a44d63ccee"

RPROVIDES:${PN} += "cmake-StellarSolver \
pkgconfig-stellarsolver \
stellarsolver-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstellarsolver2"

inherit rpm

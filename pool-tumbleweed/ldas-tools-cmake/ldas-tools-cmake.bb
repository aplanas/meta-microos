SUMMARY = "A collection of CMake functions used by LDAS (LIGO Data Analysis System) Tools"
DESCRIPTION = "LDAS (LIGO Data Analysis System) is a collection of libraries and executables \
aid in the processing of gravitation wave data sets. ldas-tools-cmake provides the \
a collection of cmake functions used by LDAS."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "ldas-tools-cmake-1.1.1-1.9.noarch.rpm"
RPM_HASH = "80357de580d33749d831ac525347fa6da2955a3bcaf59cc46553e8cbca2ce7d9f3b6f53364472342fb6375f8b6a230b6117741777eedba131fc6eac0e254d3d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ldas-tools-cmake \
pkgconfig(ldastoolscmake)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm

SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications with CRIU library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.18"

RPM_NAME = "criu-devel-3.18-1.2.aarch64.rpm"
RPM_HASH = "b2eefadc6a8cff3f51ac66c615c17b1df263e3fd06e12b6d20cd4712e52954c098fba79d2163176832642f24c7c459e7c52876f5de843fe5e4f00d76291c170f"

RPROVIDES:${PN} += "criu-devel \
pkgconfig-criu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcompel1 \
libcriu2"

inherit rpm

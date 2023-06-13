SUMMARY = "Development files for the libpgf library"
DESCRIPTION = "This package contains header files and libraries needed for developing programs \
using the libpgf library."
LICENSE = "LGPL-2.1-or-later"

PV = "7.21.7"

RPM_NAME = "libpgf-devel-7.21.7-1.10.aarch64.rpm"
RPM_HASH = "f6a915fef1323e986ecbec8b43f631ff3b6bb9126dd51e5e47ebc4b88d07c646b96c7a2ce91a685027f9addb8227fe199d0bc7110d79d2fa13b9509699a98efd"

RPROVIDES:${PN} += "libpgf-devel \
libpgf-devel(aarch-64) \
pkgconfig(libpgf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpgf7"

inherit rpm

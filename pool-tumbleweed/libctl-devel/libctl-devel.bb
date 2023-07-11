SUMMARY = "Libraries and header files for libctl library"
DESCRIPTION = "libctl is a free Guile-based library implementing flexible control files \
for scientific simulations. It was written to support MIT Photonic Bands \
and Meep software, but has proven useful in other programs too. \
 \
This package contains libraries and header files for developing \
applications that use libctl."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "libctl-devel-4.5.1-1.8.aarch64.rpm"
RPM_HASH = "1036899baca459c1642aa9633e13c661b4b1ad7ab6cb5a595c149dae7d75649ab41b1ee023aceee5b8c6dd0ab42fd8ece77b85ba3fa1d054e9d3192691eaba0c"

RPROVIDES:${PN} += "libctl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libctl7"

inherit rpm

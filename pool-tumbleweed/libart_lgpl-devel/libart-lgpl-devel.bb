SUMMARY = "Header files for the libart 2D graphics library"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of libart_lgpl."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.21"

RPM_NAME = "libart_lgpl-devel-2.3.21-25.4.aarch64.rpm"
RPM_HASH = "bfae4e711c4e6a991d5082040955271d52fc8d36dcbe1d18013ef44b13f7aba8369796a58fffde623dbb575655da8e8645d306b94a7d8be7285419ae0332aa7b"

RPROVIDES:${PN} += "libart-lgpl-devel \
pkgconfig-libart-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libart-lgpl-2-2"

inherit rpm

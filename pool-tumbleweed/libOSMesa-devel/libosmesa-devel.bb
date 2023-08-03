SUMMARY = "Development files for the Mesa Offscreen Rendering extension"
DESCRIPTION = "Development files for the OSmesa Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libOSMesa-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "b28f5d3f1437f3c5207cfd943ec09be2ef4a37806ee7cf8ab8c4ba8b0ae70947ef5d99c5d96229d06f01da8756af10e185eb1cb91e809342a52c8fe854f8cbcd"

RPROVIDES:${PN} += "libOSMesa-devel \
pkgconfig-osmesa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOSMesa8"

inherit rpm

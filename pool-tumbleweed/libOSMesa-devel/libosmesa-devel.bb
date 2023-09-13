SUMMARY = "Development files for the Mesa Offscreen Rendering extension"
DESCRIPTION = "Development files for the OSmesa Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libOSMesa-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "242b5fd6cab7926291a9258f4c28cb61abce8b9ea13b3abc973dc72082da16366a67706da475ddbb6ae8727d0a98a5b5ffd9556017372225555beea2a5dd5a18"

RPROVIDES:${PN} += "libOSMesa-devel \
pkgconfig-osmesa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOSMesa8"

inherit rpm

SUMMARY = "Development files for the Mesa Offscreen Rendering extension"
DESCRIPTION = "Development files for the OSmesa Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "libOSMesa-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "85bf9f67c42b163838c0d5d64001fd8897010ff7f75b21bb7d9e0910a18297fcda6c9693b1ef8813143716e44a9a3692cca23f7f0e9dfc0c20edb611812cb6d6"

RPROVIDES:${PN} += "libOSMesa-devel \
pkgconfig-osmesa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOSMesa8"

inherit rpm

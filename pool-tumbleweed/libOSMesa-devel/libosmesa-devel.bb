SUMMARY = "Development files for the Mesa Offscreen Rendering extension"
DESCRIPTION = "Development files for the OSmesa Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libOSMesa-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "a826c0628a50316c84065e722a1d6e642f07e004dac7fd4eae4c4ecf9d1b80784d30c1a2618139187e1735a9645ae507746586c405b4760875e971685be022e9"

RPROVIDES:${PN} += "libOSMesa-devel \
pkgconfig-osmesa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOSMesa8"

inherit rpm

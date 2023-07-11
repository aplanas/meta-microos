SUMMARY = "Development files for the Mesa Offscreen Rendering extension"
DESCRIPTION = "Development files for the OSmesa Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "libOSMesa-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "189225c4f1b9b948cbf7ece3e230ef3a6f81485f96a2716156ce7af45f78ea2ffbe8bdc86751c9b8e4821adecc3f4042c883c17a277fbe1af7e4e7de08e7bbe8"

RPROVIDES:${PN} += "libOSMesa-devel \
pkgconfig-osmesa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOSMesa8"

inherit rpm

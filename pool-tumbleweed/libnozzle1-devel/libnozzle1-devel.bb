SUMMARY = "Simple userland wrapper around kernel tap devices (developer files)"
DESCRIPTION = "This is an over-engineered commodity library to manage a pool \
of tap devices and provides the basic \
pre-up.d/up.d/down.d/post-down.d infrastructure."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libnozzle1-devel-1.21-1.10.aarch64.rpm"
RPM_HASH = "b599a90e6e5a8a04b8a7fba9932090b496d96c1344495e523ed90d2d14e79c08a30200a3b46d149b0d0ceb58d4bc5ec991316ac2fbbe8bf823a5c1e0b8362cd3"

RPROVIDES:${PN} += "libnozzle1-devel \
pkgconfig-libnozzle"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnozzle1 \
pkgconfig"

inherit rpm

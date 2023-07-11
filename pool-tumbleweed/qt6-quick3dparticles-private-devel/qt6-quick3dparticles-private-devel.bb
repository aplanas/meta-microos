SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DParticles library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DParticles that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dparticles-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "8f6d22a603bca123c1721fd1906be5171e0d929233f0117f83179a3291dab111f26a09a4dbc33e3ea3d7e4cd89fa239b39b18f6ee76ee9243411a1b4dc1ba384"

RPROVIDES:${PN} += "qt6-quick3dparticles-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DParticles"

inherit rpm

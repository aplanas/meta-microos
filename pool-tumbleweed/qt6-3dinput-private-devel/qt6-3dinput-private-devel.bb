SUMMARY = "Non-ABI stable API for the Qt 6 3DInput library"
DESCRIPTION = "This package provides private headers of libQt63DInput that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dinput-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e34a5694c7a3a7f7c9a4abfb6b85c3aba2c8c9a994cfb88d2bd76984985294f2d8ade2f689a3da3aecbff3890a00f756cfb934fadab29d69a552ec7f6f86e10a"

RPROVIDES:${PN} += "qt6-3dinput-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DInput \
qt6-3dcore-private-devel \
qt6-core-private-devel"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpers library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpers that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpers-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "265a60b0dd38c0cab3622ff3229fc1eb5d385a374983d87204f0d8961c2543a386f5f5c2fcb962b600516b0b7248e4692638abb0992dfcf78b73d73ff471c17b"

RPROVIDES:${PN} += "qt6-quick3dhelpers-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DHelpers"

inherit rpm

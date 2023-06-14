SUMMARY = "Wayland protocols used by Plasma"
DESCRIPTION = "This package contains the non-standard Wayland protocol definitions used by \
KDE Plasma."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-2.1-or-later & MIT"

PV = "1.10"

RPM_NAME = "plasma-wayland-protocols-1.10-1.3.aarch64.rpm"
RPM_HASH = "4e0c75ae8727bb6d144d5cb19d434b50db794bf4694989737afda9e73bbee0ca38bf26fe450ad13fc08f6041ea5569e5f11b7e1d6c295043223dbf08a3bb5e0d"

RPROVIDES:${PN} += "cmake-PlasmaWaylandProtocols \
plasma-wayland-protocols"

RDEPENDS:${PN} += ""

inherit rpm

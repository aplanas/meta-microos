SUMMARY = "Wayland protocols used by Plasma"
DESCRIPTION = "This package contains the non-standard Wayland protocol definitions used by \
KDE Plasma."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-2.1-or-later & MIT"

PV = "1.10"

RPM_NAME = "plasma-wayland-protocols-1.10-1.4.aarch64.rpm"
RPM_HASH = "a650b8aeac942e853d924cf89c296e13cf3ed0aa414d8a7223670f320589a3fff43a60bc44e9bcb62ca27c44fda442b1781875c6da3b7b604fe1e2ebe8a282f4"

RPROVIDES:${PN} += "cmake-PlasmaWaylandProtocols \
plasma-wayland-protocols"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 WebSockets library"
DESCRIPTION = "This package provides private headers of libQt6WebSockets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-websockets-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c35b1bd906a8481592d2d79fcb49ab84f9ad37de77e97bd6853e6e32f07ce96599a556073f76030eb8e504998f579193f9a6fa037b5066c2366613e345971054"

RPROVIDES:${PN} += "qt6-websockets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebSockets \
qt6-core-private-devel"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 WebSockets library"
DESCRIPTION = "This package provides private headers of libQt6WebSockets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-websockets-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2e40399c68686e39ddccebd46509fec0d96afe3d07937a78ecd56de9989a1cdd0f65818c8486a800199e89ae48a5561d50311bdf66041cc0cf647b8a9f54d66c"

RPROVIDES:${PN} += "qt6-websockets-private-devel \
qt6-websockets-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6WebSockets) \
qt6-core-private-devel"

inherit rpm

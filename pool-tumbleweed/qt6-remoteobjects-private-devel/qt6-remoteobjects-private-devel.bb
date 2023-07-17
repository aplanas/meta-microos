SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjects library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjects that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "bb81388ede7fe7956afcc84ebd83459e2b43a1482ff69b07f63ace904a3467fa06f870f76ce88cec91904cfe107af2d27b60e8142dd4dfcf324f6fb596cfe773"

RPROVIDES:${PN} += "qt6-remoteobjects-private-devel"

RDEPENDS:${PN} += "cmake-Qt6RemoteObjects \
qt6-core-private-devel"

inherit rpm

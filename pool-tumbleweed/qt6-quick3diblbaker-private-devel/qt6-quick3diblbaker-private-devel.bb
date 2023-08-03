SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DIblBaker library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DIblBaker that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3diblbaker-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f6864e1c357e188cf2403cad6fc55a539390c3c7695dc8a619680d2d7849556ee54b3c9f6949e8969eed99d81d62f1cc80d37046defaa55db1fff64143cb8fee"

RPROVIDES:${PN} += "qt6-quick3diblbaker-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DIblBaker \
qt6-gui-private-devel \
qt6-quick3druntimerender-private-devel"

inherit rpm

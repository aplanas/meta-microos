SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DIblBaker library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DIblBaker that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3diblbaker-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "00ad13ef11d2c48a42a8e6722298a8d61733c95aa8604d11e31570dcb22b3c47eca3d008f1fe2eb9034c39e8cc8c510fe036445ef3e35d0fbf36f6fb27cd6cec"

RPROVIDES:${PN} += "qt6-quick3diblbaker-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DIblBaker"

inherit rpm

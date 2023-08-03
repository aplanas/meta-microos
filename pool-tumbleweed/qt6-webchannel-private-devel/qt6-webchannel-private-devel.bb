SUMMARY = "Non-ABI stable API for the Qt 6 WebChannel library"
DESCRIPTION = "This package provides private headers of libQt6WebChannel that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webchannel-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "43da795d64a75363d7fdedaea5551119acf16211dec40b80ffe5928cb53b25c1f8adefc91b83fe3ade3475a230cd632141634c161cb38404536085cb0eb3acc2"

RPROVIDES:${PN} += "qt6-webchannel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebChannel \
qt6-core-private-devel"

inherit rpm

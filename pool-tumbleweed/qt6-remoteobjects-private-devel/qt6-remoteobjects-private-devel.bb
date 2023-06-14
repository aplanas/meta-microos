SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjects library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjects that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "647716183a97116102d076ac5b847a6cf0c9ce21c2c4608ce328078c4f53b46315983a5f2f5fa826332634035fc399dcc6ee2f0b2a0f8c55e2f3ecfe3c98ce54"

RPROVIDES:${PN} += "qt6-remoteobjects-private-devel"

RDEPENDS:${PN} += "cmake-Qt6RemoteObjects"

inherit rpm

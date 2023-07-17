SUMMARY = "Non-ABI stable API for the Qt 6 Network library"
DESCRIPTION = "This package provides private headers of libQt6Network that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-network-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "7014437ab0f2d76b99fd5a5bc4bbed9420bc2aeebe3bcd7318a7d7a0e612b74b9ac69bfe02d030413b49283d2dc6f3130ca471234d1f3e13fb5847aac11b146e"

RPROVIDES:${PN} += "qt6-network-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
libopenssl-3-devel \
qt6-core-private-devel"

inherit rpm

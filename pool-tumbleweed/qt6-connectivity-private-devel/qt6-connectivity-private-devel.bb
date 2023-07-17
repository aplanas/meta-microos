SUMMARY = "Non-ABI stable API for the Qt 6 connectivity libraries"
DESCRIPTION = "This package provides private headers of qt6-connectivity that are normally \
not used by application development and that do not have any ABI or \
API guarantees. \
The packages that build against these have to require the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e5746018fe39154ad77e1abf3a94190750bcadfdae142787c9e534a2d7cdae5bfc3fbd8587e0d1ea02f1aa5d904b42cbde7fde577d187f3c5226c16e036c7114"

RPROVIDES:${PN} += "qt6-connectivity-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Bluetooth \
cmake-Qt6Nfc \
qt6-core-private-devel \
qt6-network-private-devel"

inherit rpm

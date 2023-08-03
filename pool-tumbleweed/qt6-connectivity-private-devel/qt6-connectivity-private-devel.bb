SUMMARY = "Non-ABI stable API for the Qt 6 connectivity libraries"
DESCRIPTION = "This package provides private headers of qt6-connectivity that are normally \
not used by application development and that do not have any ABI or \
API guarantees. \
The packages that build against these have to require the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-connectivity-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3539f1eedc38c87dfafc08dc3bce1350f4a2849035a4b93239fe73dea20a89750e6027fe98a0e71a0ef511687d89c23d4fec3d4954f147e0044ab37a30cfae0f"

RPROVIDES:${PN} += "qt6-connectivity-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Bluetooth \
cmake-Qt6Nfc \
qt6-core-private-devel \
qt6-network-private-devel"

inherit rpm

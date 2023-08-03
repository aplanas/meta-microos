SUMMARY = "Non-ABI stable API for the Qt 6 Network library"
DESCRIPTION = "This package provides private headers of libQt6Network that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-network-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d22dc15b18a4df77761da3311a92c022e51a41a425b4fe09b21523532e209d617b65fb455d20ab90d85353836b042fed1864c8f0374802fd4cd9a6c74a87dcb3"

RPROVIDES:${PN} += "qt6-network-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
libopenssl-3-devel \
qt6-core-private-devel"

inherit rpm

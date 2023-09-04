SUMMARY = "Non-ABI stable API for the Qt 6 Network library"
DESCRIPTION = "This package provides private headers of libQt6Network that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-network-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "5def49ece37f62241d1ec755f834bf6ae847688c8943e6b8f50b51d134e61a15297e27fd8805df0ae217914e1f20974f3fa3c7f128800eec0810bce7d9fad0e8"

RPROVIDES:${PN} += "qt6-network-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
libopenssl-3-devel \
qt6-core-private-devel"

inherit rpm

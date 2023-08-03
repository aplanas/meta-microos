SUMMARY = "Non-ABI stable API for the Qt 6 Protobuf Library"
DESCRIPTION = "This package provides private headers of libQt6Protobuf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-protobuf-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4b2fec665cb87e1ccaa3c9797eab0895eb1e32d071901e34c495a9e57fa4e98535736c4bc12edfac6727d1e013b08d39f120002746b3f10d985cf131e43bf991"

RPROVIDES:${PN} += "qt6-protobuf-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Protobuf"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 Grpc Library"
DESCRIPTION = "This package provides private headers of libQt6Grpc that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "cf263a598497752793c9093efc484aee07af1c4a4d59ee361c6bbb323281120e8cd39f2371a21d050c7c5f6391d89b49c3039e4ab191e21e84dbc8f60b5b68fc"

RPROVIDES:${PN} += "qt6-grpc-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Grpc"

inherit rpm

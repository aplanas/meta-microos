SUMMARY = "Non-ABI stable API for the Qt 6 Protobuf Library"
DESCRIPTION = "This package provides private headers of libQt6Protobuf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-protobuf-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "61c7c249bc080205083d84455ba408cf7ff32d25f647624aeeb3b5bd0b4dacf9ae9ae4a3944c9f925e33f20b36f8b1c2f1b8ed80b6fa943b5d6a881e7180f91f"

RPROVIDES:${PN} += "qt6-protobuf-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Protobuf"

inherit rpm

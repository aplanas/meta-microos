SUMMARY = "Non-ABI stable API for the Qt 6 Protobuf Library"
DESCRIPTION = "This package provides private headers of libQt6Protobuf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-protobuf-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d010dfd132045151a9195033d6a872e1831e79c774a81a4aac7a1c009d80e1547f33d7d0dbb5a24442002d13d33b17a9ddf2d3919d9709a10be6417c0d949c68"

RPROVIDES:${PN} += "qt6-protobuf-private-devel \
qt6-protobuf-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Protobuf)"

inherit rpm

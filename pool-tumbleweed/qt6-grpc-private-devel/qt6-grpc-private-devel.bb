SUMMARY = "Non-ABI stable API for the Qt 6 Grpc Library"
DESCRIPTION = "This package provides private headers of libQt6Grpc that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-grpc-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "fca130b2ef194d2393e21ec0e625f35c99012144c1d15a5a3470e0aef704044609d6aa39309b0e3484edc9c2d1c33b5ade6f8a1565536d35e9d512b713b6e887"

RPROVIDES:${PN} += "qt6-grpc-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Grpc"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 Grpc Library"
DESCRIPTION = "This package provides private headers of libQt6Grpc that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b66b1053ee7d517a193bd9ca86e3969c833f7f7c20dda3c72b7790e2fd92b64d6e253f30d0f3d5ffb5633e4d87802f9ae1b09d2e2085454c8b64495adc143db7"

RPROVIDES:${PN} += "qt6-grpc-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Grpc"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 Location Library"
DESCRIPTION = "This package provides private headers of libQt6Location that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "2facf9f55942a2933fafba87319d4ab6c73f20f85f76ce9beab1c3c65c95b7e53a4bdd2bf5576f2b1e5007ab5f392287a1a9f7cede97bf8a351fa5accd660260"

RPROVIDES:${PN} += "qt6-location-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Location"

inherit rpm

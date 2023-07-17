SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginequick-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b8719757901f8c9ff12d6bfd42d8def1eac8e4881f222bcc10c8645d68246455cb2d3286202931c0cce6ee45d5faa63d0690edd86f3e91ecced641e57c8b4955"

RPROVIDES:${PN} += "qt6-webenginequick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineQuick"

inherit rpm

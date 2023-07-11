SUMMARY = "Non-ABI stable API for the Qt 6 tools libraries"
DESCRIPTION = "This package provides private headers of qt6-tools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "ff3c36c9cdfd3f82f970b167bc2dff06393c0559fd823ad144ee6e815922b35d915dd4a8172e454f8efc3bd278426721a78d37deada4ffe589f91907d75b4c5d"

RPROVIDES:${PN} += "qt6-tools-private-devel"

RDEPENDS:${PN} += ""

inherit rpm

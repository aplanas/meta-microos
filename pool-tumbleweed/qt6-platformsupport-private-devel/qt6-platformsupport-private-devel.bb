SUMMARY = "Non-ABI stable API for the  Qt6 PlatformSupport library"
DESCRIPTION = "This package provides private headers of libQt6PlatformSupport that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-platformsupport-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0adc22a78beb2e9871495ac94a6696f00fff38d465bc720c2a16e772b749523636085eb81ebe4f5937308e9b65f4d11b9907324cff89d544c57223478f3df991"

RPROVIDES:${PN} += "qt6-platformsupport-private-devel"

RDEPENDS:${PN} += "qt6-platformsupport-devel-static"

inherit rpm

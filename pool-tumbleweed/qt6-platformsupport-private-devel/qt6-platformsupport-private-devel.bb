SUMMARY = "Non-ABI stable API for the  Qt6 PlatformSupport library"
DESCRIPTION = "This package provides private headers of libQt6PlatformSupport that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-platformsupport-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "0a17e1eb34c3168959be6f5d7a3ab2cbedf9cea8b59cf6b8a721da9660394ee67ddbc3c624cc6f0cb7aa76934014a34b543373678466b2d44510903e2b13a876"

RPROVIDES:${PN} += "qt6-platformsupport-private-devel"

RDEPENDS:${PN} += "qt6-platformsupport-devel-static"

inherit rpm

SUMMARY = "Non-ABI stable API for the  Qt6 PlatformSupport library"
DESCRIPTION = "This package provides private headers of libQt6PlatformSupport that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformsupport-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "47d9d81ff2394f6c1b78bf33d3ff22110dd9f6bfaaf3ff03cbacd2981bee029e814de3ffecffcb0415f06abc4c7be44f7717589c75d575543b85f63c25505743"

RPROVIDES:${PN} += "qt6-platformsupport-private-devel"

RDEPENDS:${PN} += "qt6-platformsupport-devel-static"

inherit rpm

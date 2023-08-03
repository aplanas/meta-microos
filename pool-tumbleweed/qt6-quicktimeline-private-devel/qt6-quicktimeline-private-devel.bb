SUMMARY = "Non-ABI stable API for the Qt 6 QuickTimeline Library"
DESCRIPTION = "This package provides private headers of libQt6QuickTimeline that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quicktimeline-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "17583c21fbaf7e5da650d02fa43cace8bf684438b2fc5ace921cdaacb46f86b61a11c42f8844d096d9728eb2d0b284fe0e8dcb9c957b5171c447194fad7857fe"

RPROVIDES:${PN} += "qt6-quicktimeline-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTimeline"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 Multimedia Library"
DESCRIPTION = "This package provides private headers of libQt6Multimedia that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "afaa1bcceaec1a12779179fd4416260e9c63d5849c0f185c22631379e63f343c21832167e8eada22dc503e3c4e349591b21e1131bd46a78562330d1f5a5fe933"

RPROVIDES:${PN} += "qt6-multimedia-private-devel \
qt6-multimedia-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Multimedia)"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 LabsAnimation library"
DESCRIPTION = "This package provides private headers of libQt6LabsAnimation that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labsanimation-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "c2147e62e9df6b4866af7643783cf40913bb43503e55e1cbe0c53f357fbe5544a16c209d438584ac4e92f85b868650a260dce4d63b56dfe1ccff52e92436eb44"

RPROVIDES:${PN} += "qt6-labsanimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsAnimation"

inherit rpm

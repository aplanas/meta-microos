SUMMARY = "Non-ABI stable API for the Qt 6 LabsAnimation library"
DESCRIPTION = "This package provides private headers of libQt6LabsAnimation that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsanimation-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b0ed683654c50155fce7b8cbc15baa820f8825093f9b754770c6cc3ccc3a73885e8e09348a3125ae690d1a24132a8ed6862700632684de850d317ba067bac838"

RPROVIDES:${PN} += "qt6-labsanimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsAnimation"

inherit rpm

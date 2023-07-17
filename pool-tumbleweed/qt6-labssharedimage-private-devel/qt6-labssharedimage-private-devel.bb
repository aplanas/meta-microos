SUMMARY = "Non-ABI stable API for the Qt 6 LabsSharedImage library"
DESCRIPTION = "This package provides private headers of libQt6LabsSharedImage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssharedimage-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "ddd0409fb263f6f1632533b48d4132a5f403ff933ecd337db9a808acb6a8b6e5ddcd02a3282fc4c4e5776524f24e0a642913289d3a1b167cec11d089181c5db3"

RPROVIDES:${PN} += "qt6-labssharedimage-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsSharedImage"

inherit rpm

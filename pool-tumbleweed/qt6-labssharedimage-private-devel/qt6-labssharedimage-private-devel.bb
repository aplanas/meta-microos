SUMMARY = "Non-ABI stable API for the Qt 6 LabsSharedImage library"
DESCRIPTION = "This package provides private headers of libQt6LabsSharedImage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labssharedimage-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c6b261a8a8ab7598e6768301225058de9933037e9087933a58ed8398683d8fc84de91f32cac0203f9133f03cee2582b8a18474356425f9944ef0a7ae82236157"

RPROVIDES:${PN} += "qt6-labssharedimage-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsSharedImage"

inherit rpm

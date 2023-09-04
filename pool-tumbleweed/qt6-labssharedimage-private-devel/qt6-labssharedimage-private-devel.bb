SUMMARY = "Non-ABI stable API for the Qt 6 LabsSharedImage library"
DESCRIPTION = "This package provides private headers of libQt6LabsSharedImage that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labssharedimage-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "69b0aedadf8ce20fa94937a8ae7cf439c6c9e65b1c1236ae789b9ab014e4908b9223b0bf25907f5e3475a6c83840f2c4b115e20151795520991f94e20a7edb5d"

RPROVIDES:${PN} += "qt6-labssharedimage-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsSharedImage"

inherit rpm

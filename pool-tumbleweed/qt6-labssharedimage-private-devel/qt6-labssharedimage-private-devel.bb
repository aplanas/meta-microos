SUMMARY = "Non-ABI stable API for the Qt 6 LabsSharedImage library"
DESCRIPTION = "This package provides private headers of libQt6LabsSharedImage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssharedimage-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "c3dcd69f8a53e382171ed0482f700453b074ef655965171829d4edd201ce41103f96ecf9b3470b3d5155daf0537768c87d6462f9bb537e7be5a4d3884465bb48"

RPROVIDES:${PN} += "qt6-labssharedimage-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsSharedImage"

inherit rpm

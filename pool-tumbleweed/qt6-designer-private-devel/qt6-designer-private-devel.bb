SUMMARY = "Non-ABI stable API for the Qt 6 Designer libraries"
DESCRIPTION = "This package provides private headers of libQt6Designer that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-designer-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c2be25e350e910f7f3239b5dff3b549cf0659ba498c781843394519edbcb8ca002f234ca964fed54881636a8f0c5e7c608f55aa322502b530341fd0fe7d85d79"

RPROVIDES:${PN} += "qt6-designer-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Designer \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm

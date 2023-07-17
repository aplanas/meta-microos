SUMMARY = "Qt 6 Scxml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "29b7095e048f523280c4a5aaa0bd9f1d860454756ab526394dbab971480b39ad333cc453db34b69c0a924ac8468d26616aa0fbdfb8cda4ffe540b5575c6dc19d"

RPROVIDES:${PN} += "cmake-Qt6Scxml \
cmake-Qt6ScxmlTools \
pkgconfig-Qt6Scxml \
qt6-scxml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6Scxml6 \
pkgconfig-Qt6Core \
qt6-scxml"

inherit rpm

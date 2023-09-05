SUMMARY = "Generic map viewer: Build Environment"
DESCRIPTION = "Development headers and libraries for Marble."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "marble-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "770183eec9e8d464a22859e9a677672fb3dddb7bb599fc10a8b927720290b786d653bde8736e251a1b5bfa17efc9e10586164cdc8d5aae55c9ebea73bced8e62"

RPROVIDES:${PN} += "cmake-Astro \
cmake-Marble \
marble-devel \
marble5-devel"

RDEPENDS:${PN} += "cmake-Qt5WebEngineWidgets \
cmake-Qt5Widgets \
cmake-Qt5Xml \
libastro1 \
libmarblewidget-qt5-28"

inherit rpm

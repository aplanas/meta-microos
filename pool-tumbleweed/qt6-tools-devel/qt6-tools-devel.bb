SUMMARY = "Qt 6 Tools libraries - Development files"
DESCRIPTION = "Development files for the Qt6 tools libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-tools-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6d437b46ca4f3c3da28e986257f3170489c7a2a5e0b00a02f66d7807517f16d62701c60c423306397e374ca5cab1ac79d3ca6ce437c4dc83fc7ca296ddd11c56"

RPROVIDES:${PN} += "cmake-Qt6Tools \
cmake-Qt6ToolsTools \
qt6-tools-devel"

RDEPENDS:${PN} += "qt6-tools \
qt6-tools-helpgenerators \
qt6-tools-qdoc"

inherit rpm

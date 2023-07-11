SUMMARY = "Qt 6 Tools libraries - Development files"
DESCRIPTION = "Development files for the Qt6 tools libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fe9b412731459bef7dc3ba8c8185159da253039e6f9249962cd2fc4703b0ca5a100e1fce5739eb981d46fb26aea332b59d6d7a0c8185f4686dc65249313e8e48"

RPROVIDES:${PN} += "cmake-Qt6Tools \
cmake-Qt6ToolsTools \
qt6-tools-devel"

RDEPENDS:${PN} += "qt6-tools \
qt6-tools-helpgenerators \
qt6-tools-qdoc"

inherit rpm

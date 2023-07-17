SUMMARY = "Qt 6 Tools libraries - Development files"
DESCRIPTION = "Development files for the Qt6 tools libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "0a884bbd0e7b9d64872d00dce2c5e72f30e1082cc206893fe6bae50be4271398af38fba67cb7bff077e65d5d65cf11750492c564c9197d7e47917f83697e02bd"

RPROVIDES:${PN} += "cmake-Qt6Tools \
cmake-Qt6ToolsTools \
qt6-tools-devel"

RDEPENDS:${PN} += "qt6-tools \
qt6-tools-helpgenerators \
qt6-tools-qdoc"

inherit rpm

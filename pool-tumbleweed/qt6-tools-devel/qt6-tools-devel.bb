SUMMARY = "Qt 6 Tools libraries - Development files"
DESCRIPTION = "Development files for the Qt6 tools libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2213b3bb0ac0e315669724b51453552e807149cd23470d11177a0b372f086b82cc88b6cecf2b37a4f9daef614e2e05d309e1fe349d89de5384f9a732f4068abc"

RPROVIDES:${PN} += "cmake(Qt6Tools) \
cmake(Qt6ToolsTools) \
qt6-tools-devel \
qt6-tools-devel(aarch-64)"
RDEPENDS:${PN} += "qt6-tools \
qt6-tools-helpgenerators \
qt6-tools-qdoc"

inherit rpm

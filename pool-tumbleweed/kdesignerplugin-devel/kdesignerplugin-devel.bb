SUMMARY = "Build environment for kdesignerplugin, a framework for integration of KDE frameworks widgets"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdesignerplugin-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "78963afd56e3c602e2ab8813dd8d47de2f47817e28ccbe08a1e8667e9efcbbac9efafb840b6d718ae5687d1b195505f37b20b2220bf5830f99f3223689ec4aef"

RPROVIDES:${PN} += "cmake-KF5DesignerPlugin \
kdesignerplugin-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
kdesignerplugin"

inherit rpm

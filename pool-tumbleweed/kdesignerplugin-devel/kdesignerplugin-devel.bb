SUMMARY = "Build environment for kdesignerplugin, a framework for integration of KDE frameworks widgets"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdesignerplugin-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "03a5f1ecfdc5d1232486e82e5fe8f71739e524fc140f6044cca4ff0f0a7d6525339c86f1ee0b70625c7139d4636f773015dfd40585f87e643b7921887915ee4a"

RPROVIDES:${PN} += "cmake-KF5DesignerPlugin \
kdesignerplugin-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
kdesignerplugin"

inherit rpm

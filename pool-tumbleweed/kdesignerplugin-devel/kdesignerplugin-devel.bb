SUMMARY = "Build environment for kdesignerplugin, a framework for integration of KDE frameworks widgets"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kdesignerplugin-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "2c203a9b44147e76e145537548cbbd0eff3029c71b8cfbd79ffd35367ae9a08d504e703b8ef8653be7b6d81ba684ec9df6e91c909d1f9a5512decbbc7e91ff6b"

RPROVIDES:${PN} += "cmake-KF5DesignerPlugin \
kdesignerplugin-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
kdesignerplugin"

inherit rpm

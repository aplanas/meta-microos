SUMMARY = "Build environment for kdesignerplugin, a framework for integration of KDE frameworks widgets"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdesignerplugin-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "fa00731616e126f8701eab7524f7508a8fa1138775d764339d39646d277bd432f7735edf74f004dafd1508e8d0bf724e923973d76c83ba0fc288dfbfc9135150"

RPROVIDES:${PN} += "cmake(KF5DesignerPlugin) \
kdesignerplugin-devel \
kdesignerplugin-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt5Core) \
extra-cmake-modules \
kdesignerplugin"

inherit rpm

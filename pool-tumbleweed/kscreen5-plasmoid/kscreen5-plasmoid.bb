SUMMARY = "Plasma widget to control screen configuration"
DESCRIPTION = "This package provides a Plasma widget to control common screen configuration options."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kscreen5-plasmoid-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "064b849add576aea318c30bf0131677d452d5d7dfbb2f6b229fe299290918b1b0a816ab6751f8b9c3d8b8997e5cf8c1a783629f397e6d87e1fa8932e512792e6"

RPROVIDES:${PN} += "kscreen5-plasmoid \
kscreen5-plasmoid(aarch-64)"

RDEPENDS:${PN} += "kscreen5 \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm

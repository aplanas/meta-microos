SUMMARY = "Plasma widget to control screen configuration"
DESCRIPTION = "This package provides a Plasma widget to control common screen configuration options."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "kscreen5-plasmoid-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "12b0ed5808f69616492d55c70e17006f6bbcd575f879b0444685ab6928f9a954ab2bf8930baee13602999d47f5c996d5858f192f555ecf4b65ce9825b1d224d1"

RPROVIDES:${PN} += "kscreen5-plasmoid"

RDEPENDS:${PN} += "kscreen5 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm

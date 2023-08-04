SUMMARY = "Plasma widget to control screen configuration"
DESCRIPTION = "This package provides a Plasma widget to control common screen configuration options."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kscreen5-plasmoid-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "37b755973be9efd956fe4c4e602469e61f571daf6064e4e4c6918187ccc13e72c24a6ea41e8d0f8a2302daa98f6069215167f1bb5ec90c180b465a10e90db8f0"

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

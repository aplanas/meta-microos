SUMMARY = "Plasma widget to view address book contacts"
DESCRIPTION = "This package provides a Plasma widget to view address book contacts."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "kalendar-plasmoid-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "12999e4d492c76d0e3d8b66ee0fa0ba97a3222fd42c64ff2d6d589ffa11def799b6bdb4b216bb88c9c00b050687dfecea3ca10c5e73e8f8b6951d1d33d1233d5"

RPROVIDES:${PN} += "kalendar-plasmoid"

RDEPENDS:${PN} += "kalendar \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kalendar.contact.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.prison.1"

inherit rpm

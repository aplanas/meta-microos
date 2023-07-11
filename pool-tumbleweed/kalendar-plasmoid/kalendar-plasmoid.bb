SUMMARY = "Plasma widget to view address book contacts"
DESCRIPTION = "This package provides a Plasma widget to view address book contacts."
LICENSE = "GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "kalendar-plasmoid-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "bbc2b6e77bd647b08282edca4f99be931613b27df4fc8b50b1e6f74137fd5fe4962755c2e1137f8aba57effeb15c96a6d3479229f7757a5655f172993eabf0f7"

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

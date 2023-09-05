SUMMARY = "Plasma widget to view address book contacts"
DESCRIPTION = "This package provides a Plasma widget to view address book contacts."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "merkuro-plasmoid-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5c2a41af57292dfd621e2fcde3e19781fa27a3d5926c97bb031d5d9d3983fc7c95081a53af77cec0c07de1415aedd158eeeb83b5c800edab9540c5acff65e59b"

RPROVIDES:${PN} += "kalendar-plasmoid \
merkuro-plasmoid"

RDEPENDS:${PN} += "merkuro \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.merkuro.contact.1 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.prison.1"

inherit rpm

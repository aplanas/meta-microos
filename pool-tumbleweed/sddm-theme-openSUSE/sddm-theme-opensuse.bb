SUMMARY = "SDDM theme for openSUSE"
DESCRIPTION = "This package contains a version of the Breeze SDDM theme customized \
for openSUSE."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "sddm-theme-openSUSE-84.87~git20230131T131056~433af24-9.1.noarch.rpm"
RPM_HASH = "ff046042f4fe2484468c5d399d9c5eabf78aaf0bacb2b006aef46488816148f1c5fab772ab8b76bb89f685cb5e6e85ecefe567063ce4ec811c86ea0acef581c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sddm-theme-openSUSE"

RDEPENDS:${PN} += "libqt5-qtquickcontrols \
plasma-framework-components \
plasma5-workspace \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.private.sessions.2 \
qt5qmlimport-org.kde.plasma.workspace.components.2 \
qt5qmlimport-org.kde.plasma.workspace.keyboardlayout.1 \
wallpaper-branding-openSUSE"

inherit rpm

SUMMARY = "SDDM theme for openSUSE"
DESCRIPTION = "This package contains a version of the Breeze SDDM theme customized \
for openSUSE."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "sddm-theme-openSUSE-84.87~git20230131T131056~433af24-8.1.noarch.rpm"
RPM_HASH = "a56e854a577b0964f2d24b21159753524a7433403b00012b9569baba318a6cf0ece75f7342b35d41fe6675185adbb737a3c1528a24a6d9632cbbacb7684363da"
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

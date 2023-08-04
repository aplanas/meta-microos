SUMMARY = "Plasma 5 theme for openSUSE"
DESCRIPTION = "This package contains the Plasma 5 Look-and-feel package for openSUSE."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-theme-openSUSE-84.87~git20230131T131056~433af24-9.1.noarch.rpm"
RPM_HASH = "ce03c7ac9cb5ca6347f64f7813fae0a6c309db1ec8179a51bea1d1dfab0efe4bb0a8e998ec1931cc03623a4e4301cf0652eddb20e6f5039689a243a43d797aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-desktop-branding-openSUSE \
plasma5-theme-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kcoreaddons.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kwin.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.private.sessions.2 \
qt5qmlimport-org.kde.plasma.workspace.components.2 \
qt5qmlimport-org.kde.plasma.workspace.keyboardlayout.1 \
wallpaper-branding-openSUSE"

inherit rpm

SUMMARY = "Dedicated search application built on top of Baloo"
DESCRIPTION = "A dedicated search application built on top of Baloo"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.27.5"

RPM_NAME = "milou5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fda35ac00e5f805e98e122fa65de392ea2e077d38512945c9a20dae22c5e5af162af315f0a7413297332879db077bbbbfdb67e8d550d2258c700c863bac35562"

RPROVIDES:${PN} += "libmilou.so.5 \
libmilouqmlplugin.so \
milou5 \
qt5qmlimport-org.kde.milou.0"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5ItemModels.so.5 \
libKF5Runner.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.milou.0 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm

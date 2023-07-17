SUMMARY = "Framework to integrate services and actions in applications"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "purpose-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "524b21e17b58cf6c9edcc87013bb7f0227dfcfcf48d5250c065a3fa6fb2dceb5a791ab5fe28004e8b2f5b8454a2f83392deae1865844d0e6f72979526a11b35d"

RPROVIDES:${PN} += "libPhabricatorHelpers.so.5 \
libReviewboardHelpers.so.5 \
libphabricatorquickplugin.so \
libpurposequickplugin.so \
librbpurposequickplugin.so \
purpose \
qt5qmlimport-org.kde.purpose.1 \
qt5qmlimport-org.kde.purpose.phabricator.1 \
qt5qmlimport-org.kde.purpose.reviewboard.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdeclarative-components \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5QuickAddons5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libkaccounts.so.2 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.bluezqt.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.prison.1 \
qt5qmlimport-org.kde.purpose.1 \
qt5qmlimport-org.kde.purpose.phabricator.1 \
qt5qmlimport-org.kde.purpose.reviewboard.1"

inherit rpm

SUMMARY = "A simple chess board"
DESCRIPTION = "Knights is KDE's chess frontend. It supports playing local games against \
human players or against chess engines (XBoard and UIC), \
as well as playing online games on FICS server. \
Furthermore, it is possible to watch two different chess engines playing \
against each other."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "knights-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "aa4b797360f2100d3da4c3aca8349c7991f8237e18acb6a9ea799614bdbf5b455332779c62c7d00207aeec12161e53ecb85d7ada782b015355d8d8b05445a949"

RPROVIDES:${PN} += "knights"

RDEPENDS:${PN} += "gnuchess \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5Plasma.so.5 \
libKF5Plotting.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "A simple chess board"
DESCRIPTION = "Knights is KDE's chess frontend. It supports playing local games against \
human players or against chess engines (XBoard and UIC), \
as well as playing online games on FICS server. \
Furthermore, it is possible to watch two different chess engines playing \
against each other."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "knights-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f5e1887096f851d255df6daa2cc2a916015ea0239f48872042084990078c912ca2fd6979a6b501321104e0df78113a21f5660405d6511e3b08704c3281d97d8d"

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

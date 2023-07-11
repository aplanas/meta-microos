SUMMARY = "Central daemon of KDE workspaces"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kded-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "49fabc5ad9fb2605368ca1eedc6f042398265f60ef140f61845b277d18dad58b666765df921eefbf658b00d0f51a379e0b6cf57928c74fa2159c57276e89f8a1"

RPROVIDES:${PN} += "kded"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

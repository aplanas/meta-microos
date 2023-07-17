SUMMARY = "Central daemon of KDE workspaces"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kded-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "996ef8c94261a0b011fd04059b1a02c168575488c6822599d43a394c607ecd52aa15ad7d5fe4f953a9570112b6f76870b04294ad4bf1abd20c892ece747b8c95"

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

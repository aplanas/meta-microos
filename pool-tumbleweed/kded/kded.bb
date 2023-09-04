SUMMARY = "Central daemon of KDE workspaces"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kded-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "ad0e60e8960a39f8bbc979c360cd3f1e7e9cdf5fa4247b17cb7497a1b89f31eafc191d24fd3548e6dc04e92b79c9424d180250f494d8f46821c62d9d77a2388a"

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

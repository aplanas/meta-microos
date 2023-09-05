SUMMARY = "Disk Usage Viewer"
DESCRIPTION = "KDE free disk space utility"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdf-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d180fc7d2ec8d924c30fd3e0e6ef74775f8668c0d92de37eadc12516725af3aeceb80727140ea1f38bdcade14735e94760142f14a64c89405f6748b75ee64893"

RPROVIDES:${PN} += "kdf \
libkdfprivate.so.23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

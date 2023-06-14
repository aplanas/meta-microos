SUMMARY = "Floppy Formatter"
DESCRIPTION = "KDE Floppy Disk Utility"
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kfloppy-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b310885ece58577df3ba887b6ab8a6110bc8d9f5429c78dc817cdaea99a917c1f89c7043dc35af0d12bacdbcc969d53609eff424ef2dd432badb758661359917"

RPROVIDES:${PN} += "kfloppy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

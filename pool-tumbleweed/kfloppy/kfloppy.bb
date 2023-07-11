SUMMARY = "Floppy Formatter"
DESCRIPTION = "KDE Floppy Disk Utility"
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kfloppy-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "eabc2b0e626a82173a9eab81a8c158acbae99a0ae89eba84cec2a87077b172de5a9127f8f3abcb36ee0cabc70bbb8c6ff97cd93d842f8000fc8e3af7cc8810ed"

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

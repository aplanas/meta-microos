SUMMARY = "Provides the interface and basic tools for the KDE workspace"
DESCRIPTION = "Provides the interface and basic tools for the KDE workspace."
LICENSE = "GPL-2.0-only"

PV = "5.27.6"

RPM_NAME = "kmenuedit5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "3c5a5e4881f7f7c0d7969301cc185dd60eedcb3c00b6bf27bbc3c775242c7c5d3ebbfe3430fb0e5470e823f5269513a1a1b3f80a28aa2ff1d97d6f8eb4780525"

RPROVIDES:${PN} += "kmenuedit5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

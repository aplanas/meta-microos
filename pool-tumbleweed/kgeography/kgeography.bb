SUMMARY = "Geography Trainer"
DESCRIPTION = "KGeography is a geography learning program."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kgeography-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "71cb1810e3ebd62e7d2be2f1ee1cfcd8f9856fc440bbe1d44affc86a6b19967edc761f29b456f12045c63b1866be0eed7b6657653e2578d2579008148f1407ad"

RPROVIDES:${PN} += "kgeography \
kgeography5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

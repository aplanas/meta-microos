SUMMARY = "Scientific Calculator"
DESCRIPTION = "KCalc is the KDE calculator tool."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kcalc-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fd0223b5f19175008918d376a63f3922ce4374ebfbbcbaa355762348cb63df9e5a83df764ae06402fbc5b91d6e74adf3e4972780c7cec59eb92c2f962f964ee7"

RPROVIDES:${PN} += "application() \
application(org.kde.kcalc.desktop) \
kcalc \
kcalc(aarch-64) \
kcalc5 \
metainfo() \
metainfo(org.kde.kcalc.appdata.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmpfr.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

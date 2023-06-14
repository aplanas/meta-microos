SUMMARY = "Scientific Calculator"
DESCRIPTION = "KCalc is the KDE calculator tool."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kcalc-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fd0223b5f19175008918d376a63f3922ce4374ebfbbcbaa355762348cb63df9e5a83df764ae06402fbc5b91d6e74adf3e4972780c7cec59eb92c2f962f964ee7"

RPROVIDES:${PN} += "kcalc \
kcalc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm

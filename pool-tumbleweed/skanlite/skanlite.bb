SUMMARY = "Image Scanner Application"
DESCRIPTION = "Skanlite is an image scanner application by KDE."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "skanlite-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "50d26a498f293ff9ccca8b975960ef28db9ea6e39042a78e78b079a385095670b0843274a8af4d545cf923d680103e09f11cbd801b0850f21c2117ba265fd48d"

RPROVIDES:${PN} += "skanlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Sane.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

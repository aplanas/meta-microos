SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5NotifyConfig5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "ee85a2eb695ab79b6483b4e524b7d8bc6ede2e17b7db3bb4f7213ff15893877bd26b779a259fcd0bfbdc42e24a3ca7c601cc60427d70b3a4ad4e1ea1c7f01d29"

RPROVIDES:${PN} += "libKF5NotifyConfig.so.5 \
libKF5NotifyConfig5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcanberra.so.0 \
libstdc++.so.6"

inherit rpm

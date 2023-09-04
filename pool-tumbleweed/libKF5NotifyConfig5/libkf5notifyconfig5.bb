SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5NotifyConfig5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5841a8b6dc5e8c1f5213cb4680f8214ddc120aacbf04210f6d94af98a6868558c2b2b247315647a1074ce06d3efca57fecfbef82506da8433a3a38c373861b79"

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

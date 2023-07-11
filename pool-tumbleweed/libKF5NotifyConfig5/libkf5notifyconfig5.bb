SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5NotifyConfig5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "52be634312cbc6f8832f3622f813ebd3105bb1adb2358b008b0dc4e595e03fcf3efe81e2c79ad0e666e3e571e2e68ea16dc5e5f0e28294a892f05717a5c10aaf"

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

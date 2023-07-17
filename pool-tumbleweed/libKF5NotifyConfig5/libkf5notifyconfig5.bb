SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5NotifyConfig5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "2551faa5fafdf9bd9927c9863e5c2d5cc6e408f751ab53a40713638c096c5330b57b2c3866a1bcdb7074b428ff926371074b221d80e7a99ef296b191db900b88"

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

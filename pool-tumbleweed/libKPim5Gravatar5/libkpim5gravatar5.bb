SUMMARY = "Libgravatar library for KDE PIM applications"
DESCRIPTION = "libgravatar adds support for downloading and displaying gravatars in \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5Gravatar5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "99c7a09fcd880bde576fcdef6da898d6b848f2cf7764f98398aeb66fcd3e2fa3bbd88a63e29f5a793d434f967f1bed1397c0d045ae27818c06a921a78669f218"

RPROVIDES:${PN} += "libKPim5Gravatar.so.5 \
libKPim5Gravatar5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKPim5PimCommon.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgravatar \
libstdc++.so.6"

inherit rpm

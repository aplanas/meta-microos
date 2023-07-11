SUMMARY = "Libgravatar library for KDE PIM applications"
DESCRIPTION = "libgravatar adds support for downloading and displaying gravatars in \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5Gravatar5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "60e6a6bcebb6e892acb7bff6574d26293b389ff6e9fc7f14de06ed792b42fc6f5131c0b187443dbdfe17cfbf672148ca88b4a572686e31f997d05b3c4cb53007"

RPROVIDES:${PN} += "libKPim5Gravatar.so.5 \
libKPim5Gravatar5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5I18n.so.5 \
libKF5PimCommon.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgravatar \
libstdc++.so.6"

inherit rpm

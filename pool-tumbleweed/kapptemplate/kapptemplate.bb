SUMMARY = "Template for KDE Application Development"
DESCRIPTION = "This package contains templates to start the development of a new KDE \
application/part/plugin."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "kapptemplate-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "1366ba92c023f16753e3e45ce6194cf9ff0582ba05a72d1d87aa98dffa5e328215ef1b5565fa6424e205f998d8c706d8714218ada63e73049055b04847f5a40e"

RPROVIDES:${PN} += "kapptemplate \
kapptemplate5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

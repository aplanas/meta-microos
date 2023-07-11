SUMMARY = "Template for KDE Application Development"
DESCRIPTION = "This package contains templates to start the development of a new KDE \
application/part/plugin."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "kapptemplate-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f2f2852e236b60bb2dcf7ab22af75e9d8939c25a2199de560e88afce6d35cc2cf07238b665d51fc010010915d0c5620690192fc955576ce3646f44f3f9099189"

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

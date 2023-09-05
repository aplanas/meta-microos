SUMMARY = "UI Files Viewer"
DESCRIPTION = "Displays Qt Designer UI files"
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kuiviewer-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "268bd4e6001f8a32d34a113e354646c0e148d67bdfff1c15316d645733bcdb1ad114e9d5ccaef5d6868dd9ee7a1d5f71169c4c26709ac1b3378f8bcabf112192"

RPROVIDES:${PN} += "kuiviewer"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

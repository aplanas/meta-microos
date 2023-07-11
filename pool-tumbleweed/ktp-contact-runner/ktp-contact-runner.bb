SUMMARY = "Telepathy Krunner plugin"
DESCRIPTION = "A KRunner plugin to find your Telepathy contacts."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-contact-runner-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d32235944d8c9a6d5c1b8fffed32633add80134128148720d56ca097091f3ef7399253aa3b23d3707568a564db2ed897d21318c62bdc9195039e6b9ce9f3ba9f"

RPROVIDES:${PN} += "ktp-contact-runner \
ktp-contact-runner5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Runner.so.5 \
libKTpCommonInternals.so.9 \
libKTpModels.so.9 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm

SUMMARY = "Development tool to test KParts"
DESCRIPTION = "kpartloader is a debugging tool used to test \
loading of KParts."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kpartloader-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7f024cebe3e58caf5cb5acc7d75a54db30562ff1616a90d32767ccd9ee76715446f8222341eaaca1b43935bd72692ae0f75ed6623ce1f4afcf4cf68a6fabf352"

RPROVIDES:${PN} += "kpartloader"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

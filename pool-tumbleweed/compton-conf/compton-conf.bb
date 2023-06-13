SUMMARY = "Compositor Configuration"
DESCRIPTION = "X composite manager configuration for compton"
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.0"

RPM_NAME = "compton-conf-0.16.0-2.9.aarch64.rpm"
RPM_HASH = "4df7f065faf5c7df7c358bf14c6d8293058e6232b9f025a68e05bc15d060e27c56bad2e68ce1bc31c4b031a3ca5b09d2ce85f2d7af768a253445a9bc6cd61e6a"

RPROVIDES:${PN} += "application() \
application(compton-conf.desktop) \
compton-conf \
compton-conf(aarch-64)"

RDEPENDS:${PN} += "compton \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libconfig.so.11()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

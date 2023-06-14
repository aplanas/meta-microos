SUMMARY = "Compositor Configuration"
DESCRIPTION = "X composite manager configuration for compton"
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.0"

RPM_NAME = "compton-conf-0.16.0-2.9.aarch64.rpm"
RPM_HASH = "4df7f065faf5c7df7c358bf14c6d8293058e6232b9f025a68e05bc15d060e27c56bad2e68ce1bc31c4b031a3ca5b09d2ce85f2d7af768a253445a9bc6cd61e6a"

RPROVIDES:${PN} += "compton-conf"

RDEPENDS:${PN} += "compton \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libconfig.so.11 \
libstdc++.so.6"

inherit rpm

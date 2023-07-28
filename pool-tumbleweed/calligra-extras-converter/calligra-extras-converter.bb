SUMMARY = "Commandline tool for conversion"
DESCRIPTION = "Commandline tool for conversion between any file formats for which \
there is a chain of Calligra import/export filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-converter-3.2.1-7.20.aarch64.rpm"
RPM_HASH = "eb1e889a475de6f8f286ae493f096810ee4c9e519739eec7e31f05a6c2e3d06947f96d0534fb08e06228e2b6b3f59b1209cc11fc818e0e9b658f981877d0312a"

RPROVIDES:${PN} += "calligra-extras-converter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkomain.so.17 \
libkostore.so.17 \
libstdc++.so.6"

inherit rpm

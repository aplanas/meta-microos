SUMMARY = "Commandline tool for conversion"
DESCRIPTION = "Commandline tool for conversion between any file formats for which \
there is a chain of Calligra import/export filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-converter-3.2.1-7.19.aarch64.rpm"
RPM_HASH = "8f00faccad2d50951d7fcf2c798d4e689f5cccf3fe7ddcfb6013d8aefe689ff2503891a9b953158ada1eeb4eb86a5633d8d2c23d7cd7f0525505813840434581"

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

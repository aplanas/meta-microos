SUMMARY = "Graphical User Interface for Doxygen"
DESCRIPTION = "Doxywizard is a graphical front-end to read/edit/write doxygen \
configuration files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "1.9.6"

RPM_NAME = "doxywizard-1.9.6-4.1.aarch64.rpm"
RPM_HASH = "6963657d274c21c712f1d7ea16d2fc8a34718e6da85a19163047c6251b71eb409491d9059dc5f7127a68ed23b626e2d24fd17068c4f018ed1674871cd58416f7"

RPROVIDES:${PN} += "doxywizard"

RDEPENDS:${PN} += "doxygen \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

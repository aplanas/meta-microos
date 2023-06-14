SUMMARY = "LeechCraft Task Progress Indicator Module"
DESCRIPTION = "This package provides a Task Progress Indicator quark plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-tpi-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "79bfca4481cf5bcb155bc9cf7bca52c93c0fad601ef1006ab70101fccdf29a7fff85dadd2dc54e660397f2aa0d3cc293a3cbf1a8189069e1b0a812f81b2f4b3c"

RPROVIDES:${PN} += "leechcraft-tpi \
libleechcraft-tpi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm

SUMMARY = "Qt5 remoteobjects examples"
DESCRIPTION = "Examples for the libqt5-qtremoteobjects module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtremoteobjects-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "acc1c4925e933ce6f144a271be21f732f41ea56d02a77778df384f0738716ab7b9d307a85c4a99c227c57421e228acc7d01b14e6132666ed9e0c4835cfdf7c79"

RPROVIDES:${PN} += "libqt5-qtremoteobjects-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5RemoteObjects.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

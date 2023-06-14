SUMMARY = "Qt5 networkauth examples"
DESCRIPTION = "Examples for libqt5-qtnetworkauth module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtnetworkauth-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "09db69ca4ff0825c175e6175140671f3a8550af98249358a263cd079363ddf7ed753d02ba49e914b07b81cf0de56b04da708258125e61981bdb90a12a7adac6a"

RPROVIDES:${PN} += "libqt5-qtnetworkauth-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

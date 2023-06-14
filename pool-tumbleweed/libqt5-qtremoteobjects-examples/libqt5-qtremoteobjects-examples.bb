SUMMARY = "Qt5 remoteobjects examples"
DESCRIPTION = "Examples for the libqt5-qtremoteobjects module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtremoteobjects-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "e868316422e824f1622f575337ab099a42f60879780e5b49fe36a16ef59b7cd330ef17df6fb0ee0ea75f9dc362991da36c7357b28d42388059cd0479cef3547d"

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

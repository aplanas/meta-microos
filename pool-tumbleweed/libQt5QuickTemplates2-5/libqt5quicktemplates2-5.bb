SUMMARY = "Qt5 QuickTemplates2 Library"
DESCRIPTION = "You need this package if you want to compile programs with qtquickcontrols2."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde6"

RPM_NAME = "libQt5QuickTemplates2-5-5.15.10+kde6-1.1.aarch64.rpm"
RPM_HASH = "9cd839692d1a04ef4176fc3efb9502ceefbe6ea8c725baebf74d245cfdd65560840fc49068160083e652c9788a54f3cf8cc3c46bfe8b83496d47d69596749de0"

RPROVIDES:${PN} += "libQt5QuickTemplates2-5 \
libQt5QuickTemplates2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

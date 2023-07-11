SUMMARY = "Qt 5 Designer Components Library"
DESCRIPTION = "The Qt 5 Designer Components library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde3"

RPM_NAME = "libQt5DesignerComponents5-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "425007791c4f3b9289347f3e2fa3f06b6e225330ba62be952dc71e8b269a621cd9fa32ac446b4ca1b9379ac3ddeb06852676c8aa75b21b5f9e85db0c7e359c8d"

RPROVIDES:${PN} += "libQt5DesignerComponents.so.5 \
libQt5DesignerComponents5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Designer5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

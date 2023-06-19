SUMMARY = "Qt 5 Designer Components Library"
DESCRIPTION = "The Qt 5 Designer Components library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libQt5DesignerComponents5-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "782cf6f67bf3294de6f02587eaab431131168ba2cc779cc6b0e3c2a962a2aeb97d4c2033c9506c4cbca699e523cbe72ff816c6f10eee9760c7c2c59c78156ef9"

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

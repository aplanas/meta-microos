SUMMARY = "Designer plugin for the Qt 5 Charts library"
DESCRIPTION = "This package provides Qt Designer plugin for development with Qt Charts."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Charts5-designer-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "e8f56d54cae375c585284caca7021d713ed401a7fbfa77ff11438fd3cf20fa36063148fe9619b308bb0088e4fcb3fa48309ceeb389d69500dc82b20985861585"

RPROVIDES:${PN} += "libQt5Charts5-designer \
libqtchartsdesigner.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Charts5-devel \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libqt5-qttools \
libstdc++.so.6"

inherit rpm

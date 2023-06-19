SUMMARY = "Qt 5 Linguist Tools"
DESCRIPTION = "The Qt 5 Linguist Tools."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-linguist-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "3f22b758e54a069bf58705206971bd842450b82582de5ff00549b0deac5a37fdb033344363259506485745bd42ab901072c2b0100a90506d693cf6928dcc8eb0"

RPROVIDES:${PN} += "libqt5-linguist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5PrintSupport5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQt5Xml5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

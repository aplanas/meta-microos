SUMMARY = "Qt 5 Linguist Tools"
DESCRIPTION = "The Qt 5 Linguist Tools."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-linguist-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "c69eedec3804c2f2a19f10df8ff641d16e6e9b85040c61a933f067110531b2b40af2e29193ea79f0826a9bc4e7ec6fe8478fcb61e61d3e3c6d21cfdee706d1eb"

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

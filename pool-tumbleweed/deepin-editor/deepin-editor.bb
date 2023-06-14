SUMMARY = "A text editor for the Deepin environment"
DESCRIPTION = "Deepin Editor is a desktop text editor that supports common text editing \
features."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.40"

RPM_NAME = "deepin-editor-5.10.40-1.6.aarch64.rpm"
RPM_HASH = "2dbf02f4f7a6a40e28cc10a136b98a67869270a5b91dcb2ee8eefe2f89e318c1a498d743d3b1939b2ee9b05a6d53b2245f3e8727602ef7d19243bf60c525cb79"

RPROVIDES:${PN} += "deepin-editor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5SyntaxHighlighting.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libchardet.so.1 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libicui18n.so.73 \
libm.so.6 \
libstdc++.so.6 \
libuchardet.so.0"

inherit rpm

SUMMARY = "A text editor for the Deepin environment"
DESCRIPTION = "Deepin Editor is a desktop text editor that supports common text editing \
features."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.40"

RPM_NAME = "deepin-editor-5.10.40-1.7.aarch64.rpm"
RPM_HASH = "337f0f8bb33101636c94e8262aa4110fae2fcb5b8cd41cc3fdbc25912bf2a481522e5f988509965ed894e7354dfdaac44ad432ff6b27cf556864c1d97aedf1ab"

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

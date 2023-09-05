SUMMARY = "A distraction-free Markdown editor"
DESCRIPTION = "ghostwriter is a text editor for Markdown, which is a plain text \
markup format. For more information about Markdown, please visit John \
Gruber’s website at http://www.daringfireball.net. ghostwriter \
provides a relaxing, distraction-free writing environment."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "ghostwriter-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "978ed13848c3d4e97eab4f3f82e60b832f0b037e6c7bd1e5bfeb86591a7ad090cf1355080d2814cb01e225749e5ffd5abb7bcf19323ffc615f6b15b7ee05e672"

RPROVIDES:${PN} += "ghostwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

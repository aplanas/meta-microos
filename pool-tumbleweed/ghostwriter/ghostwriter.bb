SUMMARY = "A distraction-free Markdown editor"
DESCRIPTION = "ghostwriter is a text editor for Markdown, which is a plain text \
markup format. For more information about Markdown, please visit John \
Gruber’s website at http://www.daringfireball.net. ghostwriter \
provides a relaxing, distraction-free writing environment."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "ghostwriter-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "969ead132ef34985e8386e53aed698330ffcb6f733ca5407d2a13df1d5824b2f388542749cf15a42e3656adb9e4a0b0e8947d855cae4ce98b7cec13bce626f65"

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

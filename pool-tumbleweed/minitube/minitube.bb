SUMMARY = "Native YouTube Client"
DESCRIPTION = "Minitube is a native YouTube client. With it you can watch YouTube \
videos in a new way: you type a keyword, Minitube gives you an \
endless video stream. \
 \
Minitube is not about cloning the original YouTube web interface, \
it strives to create a new TV-like experience."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "minitube-3.9.3-1.9.aarch64.rpm"
RPM_HASH = "77f8d06469935800df7db8d0803a0a366fef9cb63f9de83335968c44776f2cc16e9a32cbb455bc08bd0faf00f81065001055abbad83a81a93ba8c9e1cb76088c"

RPROVIDES:${PN} += "minitube"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libmpv.so.2 \
libstdc++.so.6"

inherit rpm

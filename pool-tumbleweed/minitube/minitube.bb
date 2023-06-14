SUMMARY = "Native YouTube Client"
DESCRIPTION = "Minitube is a native YouTube client. With it you can watch YouTube \
videos in a new way: you type a keyword, Minitube gives you an \
endless video stream. \
 \
Minitube is not about cloning the original YouTube web interface, \
it strives to create a new TV-like experience."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "minitube-3.9.3-1.8.aarch64.rpm"
RPM_HASH = "2f058ef5ceffb51bca73565de91876a208e16ca0b986000fc25bc484f9856d6a62c631e9956dcf3f23e152f4d152f7837ef773a7b1614a5a67b552bad76a1206"

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

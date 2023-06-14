SUMMARY = "PolicyKit Library Qt Bindings"
DESCRIPTION = "Polkit-qt aims to make it easy for Qt developers to take advantage of \
PolicyKit API. It is a convenience wrapper around QAction and \
QAbstractButton that lets you integrate those two components easily \
with PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.114.0"

RPM_NAME = "libpolkit-qt5-1-1-0.114.0-2.9.aarch64.rpm"
RPM_HASH = "0f10b65c4f3aaec8ad745ee52e7a48dcc202e3a763e83fd8fe73c58f87b004ca0bb5e23aff80e11dce10167edd54751ef5d4d59f051cc372af05839af6dfdabd"

RPROVIDES:${PN} += "libpolkit-qt5-1-1 \
libpolkit-qt5-agent-1.so.1 \
libpolkit-qt5-core-1.so.1 \
libpolkit-qt5-gui-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libstdc++.so.6"

inherit rpm

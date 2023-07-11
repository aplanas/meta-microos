SUMMARY = "PolicyKit Library Qt Bindings"
DESCRIPTION = "Polkit-qt aims to make it easy for Qt developers to take advantage of \
PolicyKit API. It is a convenience wrapper around QAction and \
QAbstractButton that lets you integrate those two components easily \
with PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.114.0"

RPM_NAME = "libpolkit-qt5-1-1-0.114.0-2.10.aarch64.rpm"
RPM_HASH = "97b90f36cbdc1b64386b9649ddcce8e1c602e5eabe793f7accce22af84519a1c9665c09f40de4c05cd37ce8548b7cfa76918b5930a3a7487ee4c19deac599877"

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

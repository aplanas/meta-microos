SUMMARY = "KDAB State Machine Editor view library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "libkdstatemachineeditor_view1-1.2.8-2.16.aarch64.rpm"
RPM_HASH = "99c8db1e2cda3cd8fd84da15820e2fce11006715da7cda53b7ee3983385a695e839f633e83160ef0206bd91a3a3828a1d7ed003553fe2b7e9f666444d9fdae89"

RPROVIDES:${PN} += "libkdstatemachineeditor-view.so.1 \
libkdstatemachineeditor-view1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkdstatemachineeditor-core.so.1 \
libstdc++.so.6"

inherit rpm

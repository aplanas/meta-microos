SUMMARY = "KDAB State Machine Editor view library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "libkdstatemachineeditor_view1-1.2.8-2.18.aarch64.rpm"
RPM_HASH = "a41fcf8d5d5e1ac7c79a0bedc86d3349dc01502e3ef37c44e29315f6ad405ede391e542feae4e5651ebd9fffa6117142cdfce0fac4f87d8afd1236ee46ff3632"

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

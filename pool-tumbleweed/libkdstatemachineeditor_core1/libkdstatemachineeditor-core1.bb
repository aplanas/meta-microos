SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "libkdstatemachineeditor_core1-1.2.8-2.18.aarch64.rpm"
RPM_HASH = "2fabd81fe5611af05822682bcaf30e05791e274b323beb5a7c0cd678757eaaf57d6644208b8a92a827765307c2a89f616c97cc9316b54a05b81737ea86703546"

RPROVIDES:${PN} += "libkdstatemachineeditor-core.so.1 \
libkdstatemachineeditor-core1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libcgraph.so.6 \
libgcc-s.so.1 \
libgvc.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "libkdstatemachineeditor_core1-1.2.8-2.16.aarch64.rpm"
RPM_HASH = "6c23b29ec66239eaa7399699ad5ed5d5eb01887e03045bb417570ec3cacaf201a50bc9a2d63e7a3baba3567df3978f214d21f79817c3a3855a4e9877f45cf3a7"

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

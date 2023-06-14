SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "libkdstatemachineeditor_debuginterfaceclient1-1.2.8-2.16.aarch64.rpm"
RPM_HASH = "3e48475815445e2038d1854d945efe2de993811a678cdbb49955fe3a519a1ca9b944240129424a538f0b95aebe82e812961b6a19548c7e295a60abca785630c5"

RPROVIDES:${PN} += "libkdstatemachineeditor-debuginterfaceclient.so.1 \
libkdstatemachineeditor-debuginterfaceclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5RemoteObjects.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkdstatemachineeditor-core.so.1 \
libstdc++.so.6"

inherit rpm

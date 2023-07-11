SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "libkdstatemachineeditor_debuginterfaceclient1-1.2.8-2.18.aarch64.rpm"
RPM_HASH = "43bba1e8b492af424e7d2647048be5f10d5b7d9afe39eb091239d249df3f446f6c12c37d5be4ffaaef803714eb4cc8140542c79d6774c234214d3c2e2aa8c845"

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
